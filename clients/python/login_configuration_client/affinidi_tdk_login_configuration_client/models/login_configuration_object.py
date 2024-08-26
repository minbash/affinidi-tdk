# coding: utf-8

"""
    OidcVpAdapterBackend

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.0
    Contact: info@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import Any, Dict, List, Optional
from pydantic import BaseModel, Field, StrictStr, conlist
from affinidi_tdk_login_configuration_client.models.id_token_mapping import IdTokenMapping
from affinidi_tdk_login_configuration_client.models.login_configuration_client_metadata_output import LoginConfigurationClientMetadataOutput
from affinidi_tdk_login_configuration_client.models.token_endpoint_auth_method import TokenEndpointAuthMethod

class LoginConfigurationObject(BaseModel):
    """
    LoginConfigurationObject
    """
    ari: StrictStr = Field(default=..., description="Configuration ari")
    configuration_id: Optional[StrictStr] = Field(default=None, alias="configurationId", description="Configuration id")
    project_id: StrictStr = Field(default=..., alias="projectId", description="Project id")
    name: StrictStr = Field(default=..., description="User defined login configuration name")
    redirect_uris: Optional[conlist(StrictStr)] = Field(default=None, alias="redirectUris", description="OAuth 2.0 Redirect URIs")
    post_logout_redirect_uris: Optional[conlist(StrictStr)] = Field(default=None, alias="postLogoutRedirectUris", description="Post Logout Redirect URIs, Used to redirect the user's browser to a specified URL after the logout process is complete. Must match the domain, port, scheme of at least one of the registered redirect URIs")
    scope: Optional[StrictStr] = Field(default=None, description="OAuth 2.0 Client Scope")
    client_id: StrictStr = Field(default=..., alias="clientId", description="OAuth 2.0 Client ID")
    creation_date: StrictStr = Field(default=..., alias="creationDate", description="OAuth 2.0 Client Creation Date")
    vp_definition: StrictStr = Field(default=..., alias="vpDefinition", description="VP definition in JSON stringify format")
    presentation_definition: Optional[Dict[str, Any]] = Field(default=None, alias="presentationDefinition", description="Presentation Definition")
    id_token_mapping: IdTokenMapping = Field(default=..., alias="idTokenMapping")
    client_metadata: LoginConfigurationClientMetadataOutput = Field(default=..., alias="clientMetadata")
    token_endpoint_auth_method: TokenEndpointAuthMethod = Field(default=..., alias="tokenEndpointAuthMethod")
    additional_properties: Dict[str, Any] = {}
    __properties = ["ari", "configurationId", "projectId", "name", "redirectUris", "postLogoutRedirectUris", "scope", "clientId", "creationDate", "vpDefinition", "presentationDefinition", "idTokenMapping", "clientMetadata", "tokenEndpointAuthMethod"]

    class Config:
        """Pydantic configuration"""
        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> LoginConfigurationObject:
        """Create an instance of LoginConfigurationObject from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                            "additional_properties"
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of id_token_mapping
        if self.id_token_mapping:
            _dict['idTokenMapping'] = self.id_token_mapping.to_dict()
        # override the default output from pydantic by calling `to_dict()` of client_metadata
        if self.client_metadata:
            _dict['clientMetadata'] = self.client_metadata.to_dict()
        # puts key-value pairs in additional_properties in the top level
        if self.additional_properties is not None:
            for _key, _value in self.additional_properties.items():
                _dict[_key] = _value

        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> LoginConfigurationObject:
        """Create an instance of LoginConfigurationObject from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return LoginConfigurationObject.parse_obj(obj)

        _obj = LoginConfigurationObject.parse_obj({
            "ari": obj.get("ari"),
            "configuration_id": obj.get("configurationId"),
            "project_id": obj.get("projectId"),
            "name": obj.get("name"),
            "redirect_uris": obj.get("redirectUris"),
            "post_logout_redirect_uris": obj.get("postLogoutRedirectUris"),
            "scope": obj.get("scope"),
            "client_id": obj.get("clientId"),
            "creation_date": obj.get("creationDate"),
            "vp_definition": obj.get("vpDefinition"),
            "presentation_definition": obj.get("presentationDefinition"),
            "id_token_mapping": IdTokenMapping.from_dict(obj.get("idTokenMapping")) if obj.get("idTokenMapping") is not None else None,
            "client_metadata": LoginConfigurationClientMetadataOutput.from_dict(obj.get("clientMetadata")) if obj.get("clientMetadata") is not None else None,
            "token_endpoint_auth_method": obj.get("tokenEndpointAuthMethod")
        })
        # store additional fields in additional_properties
        for _key in obj.keys():
            if _key not in cls.__properties:
                _obj.additional_properties[_key] = obj.get(_key)

        return _obj


