//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

import 'package:dio/dio.dart';
import 'package:built_value/serializer.dart';
import 'package:affinidi_tdk_iam_client/src/serializers.dart';
import 'package:affinidi_tdk_iam_client/src/auth/api_key_auth.dart';
import 'package:affinidi_tdk_iam_client/src/auth/basic_auth.dart';
import 'package:affinidi_tdk_iam_client/src/auth/bearer_auth.dart';
import 'package:affinidi_tdk_iam_client/src/auth/oauth.dart';
import 'package:affinidi_tdk_iam_client/src/api/consumer_auth_api.dart';
import 'package:affinidi_tdk_iam_client/src/api/default_api.dart';
import 'package:affinidi_tdk_iam_client/src/api/policies_api.dart';
import 'package:affinidi_tdk_iam_client/src/api/projects_api.dart';
import 'package:affinidi_tdk_iam_client/src/api/sts_api.dart';
import 'package:affinidi_tdk_iam_client/src/api/tokens_api.dart';
import 'package:affinidi_tdk_iam_client/src/api/well_known_api.dart';

class AffinidiTdkIamClient {
  static const String basePath = r'https://apse1.api.affinidi.io/iam';

  final Dio dio;
  final Serializers serializers;

  AffinidiTdkIamClient({
    Dio? dio,
    Serializers? serializers,
    String? basePathOverride,
    List<Interceptor>? interceptors,
    Future<String?> Function()? authTokenHook,
  })  : this.serializers = serializers ?? standardSerializers,
        this.dio = dio ??
            Dio(BaseOptions(
              baseUrl: basePathOverride ?? basePath,
              connectTimeout: const Duration(milliseconds: 5000),
              receiveTimeout: const Duration(milliseconds: 3000),
            )) {
    if (interceptors == null) {
      this.dio.interceptors.addAll([
        OAuthInterceptor(),
        BasicAuthInterceptor(),
        BearerAuthInterceptor(),
        ApiKeyAuthInterceptor(),
      ]);
    } else {
      this.dio.interceptors.addAll(interceptors);
    }

    if (authTokenHook != null) {
      final authTokenInterceptor = InterceptorsWrapper(
        onRequest: (options, handler) async {
          try {
            // Retrieve the auth token asynchronously, and set it in headers
            final token = await authTokenHook();
            options.headers['Authorization'] = 'Bearer $token';
          } catch (e) {
            print("Error retrieving auth token: $e");
          }
          // Continue with the request
          handler.next(options);
        },
      );

      // Add the authTokenInterceptor to Dio
      this.dio.interceptors.add(authTokenInterceptor);
    }
  }

  void setOAuthToken(String name, String token) {
    if (this.dio.interceptors.any((i) => i is OAuthInterceptor)) {
      (this.dio.interceptors.firstWhere((i) => i is OAuthInterceptor) as OAuthInterceptor).tokens[name] = token;
    }
  }

  void setBearerAuth(String name, String token) {
    if (this.dio.interceptors.any((i) => i is BearerAuthInterceptor)) {
      (this.dio.interceptors.firstWhere((i) => i is BearerAuthInterceptor) as BearerAuthInterceptor).tokens[name] = token;
    }
  }

  void setBasicAuth(String name, String username, String password) {
    if (this.dio.interceptors.any((i) => i is BasicAuthInterceptor)) {
      (this.dio.interceptors.firstWhere((i) => i is BasicAuthInterceptor) as BasicAuthInterceptor).authInfo[name] = BasicAuthInfo(username, password);
    }
  }

  void setApiKey(String name, String apiKey) {
    if (this.dio.interceptors.any((i) => i is ApiKeyAuthInterceptor)) {
      (this.dio.interceptors.firstWhere((element) => element is ApiKeyAuthInterceptor) as ApiKeyAuthInterceptor).apiKeys[name] = apiKey;
    }
  }

  /// Get ConsumerAuthApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  ConsumerAuthApi getConsumerAuthApi() {
    return ConsumerAuthApi(dio, serializers);
  }

  /// Get DefaultApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  DefaultApi getDefaultApi() {
    return DefaultApi(dio, serializers);
  }

  /// Get PoliciesApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  PoliciesApi getPoliciesApi() {
    return PoliciesApi(dio, serializers);
  }

  /// Get ProjectsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  ProjectsApi getProjectsApi() {
    return ProjectsApi(dio, serializers);
  }

  /// Get StsApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  StsApi getStsApi() {
    return StsApi(dio, serializers);
  }

  /// Get TokensApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  TokensApi getTokensApi() {
    return TokensApi(dio, serializers);
  }

  /// Get WellKnownApi instance, base route and serializer can be overridden by a given but be careful,
  /// by doing that all interceptors will not be executed
  WellKnownApi getWellKnownApi() {
    return WellKnownApi(dio, serializers);
  }
}
