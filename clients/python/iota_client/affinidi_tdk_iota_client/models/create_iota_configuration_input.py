# coding: utf-8

"""
    IotaService

    Affinidi IotaService Structure

    The version of the OpenAPI document: 1.0.0
    Contact: nucleus.team@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import Optional, Union
from pydantic import BaseModel, Field, StrictBool, StrictStr, confloat, conint
from affinidi_tdk_iota_client.models.iota_configuration_dto_client_metadata import IotaConfigurationDtoClientMetadata

class CreateIotaConfigurationInput(BaseModel):
    """
    CreateIotaConfigurationInput
    """
    name: StrictStr = Field(..., description="The name of the config")
    wallet_ari: StrictStr = Field(..., alias="walletAri", description="The wallet Ari that will be used to sign")
    iota_response_webhook_url: Optional[StrictStr] = Field(None, alias="iotaResponseWebhookURL", description="webhook to call when data is ready")
    enable_verification: StrictBool = Field(..., alias="enableVerification")
    enable_consent_audit_log: StrictBool = Field(..., alias="enableConsentAuditLog")
    token_max_age: Optional[Union[confloat(ge=1, strict=True), conint(ge=1, strict=True)]] = Field(None, alias="tokenMaxAge", description="token time to live in seconds")
    client_metadata: IotaConfigurationDtoClientMetadata = Field(..., alias="clientMetadata")
    __properties = ["name", "walletAri", "iotaResponseWebhookURL", "enableVerification", "enableConsentAuditLog", "tokenMaxAge", "clientMetadata"]

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
    def from_json(cls, json_str: str) -> CreateIotaConfigurationInput:
        """Create an instance of CreateIotaConfigurationInput from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of client_metadata
        if self.client_metadata:
            _dict['clientMetadata'] = self.client_metadata.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CreateIotaConfigurationInput:
        """Create an instance of CreateIotaConfigurationInput from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CreateIotaConfigurationInput.parse_obj(obj)

        _obj = CreateIotaConfigurationInput.parse_obj({
            "name": obj.get("name"),
            "wallet_ari": obj.get("walletAri"),
            "iota_response_webhook_url": obj.get("iotaResponseWebhookURL"),
            "enable_verification": obj.get("enableVerification"),
            "enable_consent_audit_log": obj.get("enableConsentAuditLog"),
            "token_max_age": obj.get("tokenMaxAge"),
            "client_metadata": IotaConfigurationDtoClientMetadata.from_dict(obj.get("clientMetadata")) if obj.get("clientMetadata") is not None else None
        })
        return _obj


