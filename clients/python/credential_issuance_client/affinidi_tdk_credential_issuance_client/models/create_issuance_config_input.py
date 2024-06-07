# coding: utf-8

"""
    CredentialIssuanceService

    Affinidi Credential Issuance Service Structure

    The version of the OpenAPI document: 1.0.0
    Contact: nucleus.team@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import Any, Dict, List, Optional, Union
from pydantic import BaseModel, Field, StrictStr, confloat, conint, conlist, validator
from affinidi_tdk_credential_issuance_client.models.create_issuance_config_input_credential_supported_inner import CreateIssuanceConfigInputCredentialSupportedInner

class CreateIssuanceConfigInput(BaseModel):
    """
    CreateIssuanceConfigInput
    """
    issuer_wallet_id: StrictStr = Field(..., alias="issuerWalletId", description="Issuer Wallet id")
    credential_offer_duration: Optional[Union[confloat(le=604801, ge=1, multiple_of=1, strict=True), conint(le=604801, ge=1, strict=True)]] = Field(None, alias="credentialOfferDuration", description="credential offer duration in second")
    format: Optional[StrictStr] = Field(None, description="String identifying the format of this Credential, i.e., ldp_vc. Depending on the format value, the object contains further elements defining the type")
    credential_supported: conlist(CreateIssuanceConfigInputCredentialSupportedInner) = Field(..., alias="credentialSupported")
    issuer_metadata: Optional[Dict[str, Any]] = Field(None, alias="issuerMetadata", description="Issuer public information wallet may want to show to user during consent confirmation")
    __properties = ["issuerWalletId", "credentialOfferDuration", "format", "credentialSupported", "issuerMetadata"]

    @validator('format')
    def format_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in ('ldp_vc'):
            raise ValueError("must be one of enum values ('ldp_vc')")
        return value

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
    def from_json(cls, json_str: str) -> CreateIssuanceConfigInput:
        """Create an instance of CreateIssuanceConfigInput from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in credential_supported (list)
        _items = []
        if self.credential_supported:
            for _item in self.credential_supported:
                if _item:
                    _items.append(_item.to_dict())
            _dict['credentialSupported'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CreateIssuanceConfigInput:
        """Create an instance of CreateIssuanceConfigInput from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CreateIssuanceConfigInput.parse_obj(obj)

        _obj = CreateIssuanceConfigInput.parse_obj({
            "issuer_wallet_id": obj.get("issuerWalletId"),
            "credential_offer_duration": obj.get("credentialOfferDuration"),
            "format": obj.get("format"),
            "credential_supported": [CreateIssuanceConfigInputCredentialSupportedInner.from_dict(_item) for _item in obj.get("credentialSupported")] if obj.get("credentialSupported") is not None else None,
            "issuer_metadata": obj.get("issuerMetadata")
        })
        return _obj


