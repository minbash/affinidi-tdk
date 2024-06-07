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

from datetime import datetime

from pydantic import BaseModel, Field

class StartIssuanceInputDataInnerMetaData(BaseModel):
    """
    Object of metadata to be included in the additionalProperties related to vc  # noqa: E501
    """
    expiration_date: datetime = Field(..., alias="expirationDate", description="Date and time when the credential will expire")
    __properties = ["expirationDate"]

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
    def from_json(cls, json_str: str) -> StartIssuanceInputDataInnerMetaData:
        """Create an instance of StartIssuanceInputDataInnerMetaData from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> StartIssuanceInputDataInnerMetaData:
        """Create an instance of StartIssuanceInputDataInnerMetaData from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return StartIssuanceInputDataInnerMetaData.parse_obj(obj)

        _obj = StartIssuanceInputDataInnerMetaData.parse_obj({
            "expiration_date": obj.get("expirationDate")
        })
        return _obj


