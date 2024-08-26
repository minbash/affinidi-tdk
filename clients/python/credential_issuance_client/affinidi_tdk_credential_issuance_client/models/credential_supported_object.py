# coding: utf-8

"""
    CredentialIssuanceService

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


from typing import Optional
from pydantic import BaseModel, Field, StrictStr, constr, validator
from affinidi_tdk_credential_issuance_client.models.supported_credential_metadata import SupportedCredentialMetadata

class CredentialSupportedObject(BaseModel):
    """
    CredentialSupportedObject
    """
    credential_type_id: StrictStr = Field(default=..., alias="credentialTypeId", description="It is a String that identifies a Credential that is being requested to be issued.")
    json_schema_url: constr(strict=True) = Field(default=..., alias="jsonSchemaUrl", description="credential jsonLdContextUrl")
    json_ld_context_url: constr(strict=True) = Field(default=..., alias="jsonLdContextUrl", description="credential jsonSchemaUrl")
    metadata: Optional[SupportedCredentialMetadata] = None
    __properties = ["credentialTypeId", "jsonSchemaUrl", "jsonLdContextUrl", "metadata"]

    @validator('json_schema_url')
    def json_schema_url_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if not re.match(r"^https:\/\/(.+)\.json$", value):
            raise ValueError(r"must validate the regular expression /^https:\/\/(.+)\.json$/")
        return value

    @validator('json_ld_context_url')
    def json_ld_context_url_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if not re.match(r"^https:\/\/(.+)\.jsonld$", value):
            raise ValueError(r"must validate the regular expression /^https:\/\/(.+)\.jsonld$/")
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
    def from_json(cls, json_str: str) -> CredentialSupportedObject:
        """Create an instance of CredentialSupportedObject from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of metadata
        if self.metadata:
            _dict['metadata'] = self.metadata.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CredentialSupportedObject:
        """Create an instance of CredentialSupportedObject from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CredentialSupportedObject.parse_obj(obj)

        _obj = CredentialSupportedObject.parse_obj({
            "credential_type_id": obj.get("credentialTypeId"),
            "json_schema_url": obj.get("jsonSchemaUrl"),
            "json_ld_context_url": obj.get("jsonLdContextUrl"),
            "metadata": SupportedCredentialMetadata.from_dict(obj.get("metadata")) if obj.get("metadata") is not None else None
        })
        return _obj


