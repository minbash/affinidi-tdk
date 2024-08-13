# coding: utf-8

# flake8: noqa

"""
    OidcVpAdapterBackend

    Affinidi OIDC VP Adapter Backend  An authorization token is necessary to create or obtain a project Access Token and access Admin APIs. Follow these step-by-step [instructions](https://lemmatree.atlassian.net/wiki/spaces/NETCORE/pages/2735317648020/ASA+Developer+Flow#Instructions-on-how-to-create-the-Project.) to set up an authorization token 

    The version of the OpenAPI document: 1.0.0
    Contact: info@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


__version__ = "1.0.0"

# import apis into sdk package
from affinidi_tdk_login_configuration_client.api.allow_list_api import AllowListApi
from affinidi_tdk_login_configuration_client.api.configuration_api import ConfigurationApi
from affinidi_tdk_login_configuration_client.api.deny_list_api import DenyListApi
from affinidi_tdk_login_configuration_client.api.group_api import GroupApi
from affinidi_tdk_login_configuration_client.api.idp_api import IdpApi

# import ApiClient
from affinidi_tdk_login_configuration_client.api_response import ApiResponse
from affinidi_tdk_login_configuration_client.api_client import ApiClient
from affinidi_tdk_login_configuration_client.configuration import Configuration
from affinidi_tdk_login_configuration_client.exceptions import OpenApiException
from affinidi_tdk_login_configuration_client.exceptions import ApiTypeError
from affinidi_tdk_login_configuration_client.exceptions import ApiValueError
from affinidi_tdk_login_configuration_client.exceptions import ApiKeyError
from affinidi_tdk_login_configuration_client.exceptions import ApiAttributeError
from affinidi_tdk_login_configuration_client.exceptions import ApiException

# import models into sdk package
from affinidi_tdk_login_configuration_client.models.action_forbidden_error import ActionForbiddenError
from affinidi_tdk_login_configuration_client.models.add_user_to_group_input import AddUserToGroupInput
from affinidi_tdk_login_configuration_client.models.blocked_users import BlockedUsers
from affinidi_tdk_login_configuration_client.models.blocked_users_input import BlockedUsersInput
from affinidi_tdk_login_configuration_client.models.cors_login_session_accept_response_ok import CorsLoginSessionAcceptResponseOK
from affinidi_tdk_login_configuration_client.models.cors_login_session_for_idp_ok import CorsLoginSessionForIdpOK
from affinidi_tdk_login_configuration_client.models.cors_login_session_reject_response_ok import CorsLoginSessionRejectResponseOK
from affinidi_tdk_login_configuration_client.models.create_group_input import CreateGroupInput
from affinidi_tdk_login_configuration_client.models.create_hydra_network_error import CreateHydraNetworkError
from affinidi_tdk_login_configuration_client.models.create_login_configuration_input import CreateLoginConfigurationInput
from affinidi_tdk_login_configuration_client.models.create_login_configuration_output import CreateLoginConfigurationOutput
from affinidi_tdk_login_configuration_client.models.create_login_configuration_output_auth import CreateLoginConfigurationOutputAuth
from affinidi_tdk_login_configuration_client.models.create_login_configurations400_response import CreateLoginConfigurations400Response
from affinidi_tdk_login_configuration_client.models.create_project_network_error import CreateProjectNetworkError
from affinidi_tdk_login_configuration_client.models.error_o_auth2 import ErrorOAuth2
from affinidi_tdk_login_configuration_client.models.get_user_info import GetUserInfo
from affinidi_tdk_login_configuration_client.models.group_dto import GroupDto
from affinidi_tdk_login_configuration_client.models.group_names import GroupNames
from affinidi_tdk_login_configuration_client.models.group_names_input import GroupNamesInput
from affinidi_tdk_login_configuration_client.models.group_user_mapping_dto import GroupUserMappingDto
from affinidi_tdk_login_configuration_client.models.group_user_mappings_list import GroupUserMappingsList
from affinidi_tdk_login_configuration_client.models.groups_list import GroupsList
from affinidi_tdk_login_configuration_client.models.groups_per_user_limit_exceeded_error import GroupsPerUserLimitExceededError
from affinidi_tdk_login_configuration_client.models.id_token_mapping import IdTokenMapping
from affinidi_tdk_login_configuration_client.models.id_token_mapping_inner import IdTokenMappingInner
from affinidi_tdk_login_configuration_client.models.invalid_claim_context_error import InvalidClaimContextError
from affinidi_tdk_login_configuration_client.models.invalid_groups_error import InvalidGroupsError
from affinidi_tdk_login_configuration_client.models.invalid_parameter_error import InvalidParameterError
from affinidi_tdk_login_configuration_client.models.invalid_parameter_error_details_inner import InvalidParameterErrorDetailsInner
from affinidi_tdk_login_configuration_client.models.invalid_vp_token_creation_time_error import InvalidVPTokenCreationTimeError
from affinidi_tdk_login_configuration_client.models.json_web_key import JsonWebKey
from affinidi_tdk_login_configuration_client.models.json_web_key_keys_inner import JsonWebKeyKeysInner
from affinidi_tdk_login_configuration_client.models.list_login_configuration_output import ListLoginConfigurationOutput
from affinidi_tdk_login_configuration_client.models.login_configuration_client_metadata_input import LoginConfigurationClientMetadataInput
from affinidi_tdk_login_configuration_client.models.login_configuration_client_metadata_output import LoginConfigurationClientMetadataOutput
from affinidi_tdk_login_configuration_client.models.login_configuration_object import LoginConfigurationObject
from affinidi_tdk_login_configuration_client.models.login_configuration_read_invalid_client_id_error import LoginConfigurationReadInvalidClientIdError
from affinidi_tdk_login_configuration_client.models.login_session_accept_response_input import LoginSessionAcceptResponseInput
from affinidi_tdk_login_configuration_client.models.login_session_accept_response_output import LoginSessionAcceptResponseOutput
from affinidi_tdk_login_configuration_client.models.login_session_dto import LoginSessionDto
from affinidi_tdk_login_configuration_client.models.login_session_dto_authorization_request import LoginSessionDtoAuthorizationRequest
from affinidi_tdk_login_configuration_client.models.login_session_for_idp_input import LoginSessionForIDPInput
from affinidi_tdk_login_configuration_client.models.login_session_reject_response_input import LoginSessionRejectResponseInput
from affinidi_tdk_login_configuration_client.models.login_session_reject_response_output import LoginSessionRejectResponseOutput
from affinidi_tdk_login_configuration_client.models.not_found_error import NotFoundError
from affinidi_tdk_login_configuration_client.models.o_auth2_token import OAuth2Token
from affinidi_tdk_login_configuration_client.models.oidc_config import OIDCConfig
from affinidi_tdk_login_configuration_client.models.oidc_config_credentials_supported_draft00_inner import OIDCConfigCredentialsSupportedDraft00Inner
from affinidi_tdk_login_configuration_client.models.redirect_response import RedirectResponse
from affinidi_tdk_login_configuration_client.models.remove_user_from_group_input import RemoveUserFromGroupInput
from affinidi_tdk_login_configuration_client.models.resource_creation_error import ResourceCreationError
from affinidi_tdk_login_configuration_client.models.service_error_response import ServiceErrorResponse
from affinidi_tdk_login_configuration_client.models.service_error_response_details_inner import ServiceErrorResponseDetailsInner
from affinidi_tdk_login_configuration_client.models.token_endpoint_auth_method import TokenEndpointAuthMethod
from affinidi_tdk_login_configuration_client.models.unauthorized_error import UnauthorizedError
from affinidi_tdk_login_configuration_client.models.update_login_configuration_input import UpdateLoginConfigurationInput
from affinidi_tdk_login_configuration_client.models.vp_token_validation_error import VPTokenValidationError
