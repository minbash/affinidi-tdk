# coding: utf-8

"""
    CloudWalletEssentials

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


from typing import Any, Dict
from pydantic import BaseModel, Field

class GetRevocationListCredentialResultDto(BaseModel):
    """
    DTO contains revocation list credential  # noqa: E501
    """
    revocation_list_credential: Dict[str, Any] = Field(default=..., alias="revocationListCredential")
    __properties = ["revocationListCredential"]

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
    def from_json(cls, json_str: str) -> GetRevocationListCredentialResultDto:
        """Create an instance of GetRevocationListCredentialResultDto from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> GetRevocationListCredentialResultDto:
        """Create an instance of GetRevocationListCredentialResultDto from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return GetRevocationListCredentialResultDto.parse_obj(obj)

        _obj = GetRevocationListCredentialResultDto.parse_obj({
            "revocation_list_credential": obj.get("revocationListCredential")
        })
        return _obj


