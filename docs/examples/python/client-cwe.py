# NOTE: affinidi_tdk.auth_provider is not published to PyPi yet
# pip3 install <path to python client_cwe file>

from affinidi_tdk_client_cwe.api_client import ApiClient
from affinidi_tdk_client_cwe.configuration import Configuration
from affinidi_tdk_client_cwe.api.wallet_api import WalletApi
import affinidi_tdk.auth_provider

stats = {
  'privateKey': '<your_private_key>',
  'publicKey': '<your_public_key>',
  'passphrase': 'top-secret',
  'keyId': 'KeyId',
  'machineUserId': '<your_machine_user_id>',
  'projectId': '<your_project_id>',
  'tokenEndpoint': 'https://apse1.auth.developer.affinidi.io/auth/oauth2/token',
  'apiGatewayUrl': 'https://apse1.api.affinidi.io'
}

authProvider = affinidi_tdk.auth_provider.AuthProvider(stats)

projectScopedToken = authProvider.fetch_project_scoped_token()

client = ApiClient(Configuration(host="<api_gateway_url>"))

wallet_api = WalletApi(client)

wallet = wallet_api.create_wallet()

walletInfo = wallet_api.get_wallet(wallet.id)

wallets = wallet_api.list_wallets()