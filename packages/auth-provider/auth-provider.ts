import { Jwt, ProjectScopedToken } from './helpers'

export interface IAuthProviderParams {
  apiGatewayUrl: string
  keyId: string
  machineUserId: string
  passphrase: string
  privateKey: string
  projectId: string
  publicKey: string
  tokenEndpoint: string
}

export class AuthProvider {
  private projectScopedToken = ''
  private readonly apiGatewayUrl: string = ''
  private readonly keyId: string = ''
  private readonly machineUserId: string = ''
  private readonly passphrase: string = ''
  private readonly privateKey: string = ''
  private readonly projectId: string = ''
  private readonly publicKey: string = ''
  private readonly tokenEndpoint: string = ''
  private readonly projectScopedTokenInstance: ProjectScopedToken
  private readonly jwt: Jwt

  constructor(param: { [key: string]: string }) {
    const authProviderParams: IAuthProviderParams = {
      apiGatewayUrl: '',
      keyId: '',
      machineUserId: '',
      passphrase: '',
      privateKey: '',
      projectId: '',
      publicKey: '',
      tokenEndpoint: '',
    }
    this.validateMissingInput(authProviderParams, param)
    this.apiGatewayUrl = param.apiGatewayUrl
    this.keyId = param.keyId
    this.machineUserId = param.machineUserId
    this.passphrase = param.passphrase
    this.privateKey = param.privateKey
    this.projectId = param.projectId
    this.publicKey = param.publicKey
    this.tokenEndpoint = param.tokenEndpoint
    this.projectScopedTokenInstance = new ProjectScopedToken()
    this.jwt = new Jwt()
  }

  private validateMissingInput<T>(interfaceType: T, input: any): void {
    const missingFields: string[] = []

    const keys = Object.keys(interfaceType as object) as Array<keyof T>
    keys.forEach((key) => !input[key] && missingFields.push(key as string))

    if (missingFields.length > 0) {
      throw new Error(`Required fields missing: ${missingFields.join(', ')}`)
    }
  }

  private shouldRefreshToken(): boolean {
    const itExistsAndExpired =
      !!this.projectScopedToken &&
      this.jwt.validateToken(this.projectScopedToken, this.publicKey).isExpired // NOTE: `isValid` for project scoped token can be checked when we pass Elements public key

    return !this.projectScopedToken || itExistsAndExpired
  }

  public async fetchProjectScopedToken(): Promise<string> {
    if (this.shouldRefreshToken()) {
      this.projectScopedToken =
        await this.projectScopedTokenInstance.fetchProjectScopedToken({
          apiGatewayUrl: this.apiGatewayUrl,
          keyId: this.keyId,
          machineUserId: this.machineUserId,
          passphrase: this.passphrase,
          privateKey: this.privateKey,
          projectId: this.projectId,
          tokenEndpoint: this.tokenEndpoint,
        })
    }

    return this.projectScopedToken
  }
}
