# coding: utf-8

"""
    CredentialIssuanceService

    Affinidi Credential Issuance Service Structure

    The version of the OpenAPI document: 1.0.0
    Contact: info@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import List, Optional
from pydantic import BaseModel, conlist
from affinidi_tdk_credential_issuance_client.models.supported_credential_metadata_display_inner import SupportedCredentialMetadataDisplayInner

class SupportedCredentialMetadata(BaseModel):
    """
    SupportedCredentialMetadata
    """
    display: Optional[conlist(SupportedCredentialMetadataDisplayInner)] = None
    additional_properties: Dict[str, Any] = {}
    __properties = ["display"]

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
    def from_json(cls, json_str: str) -> SupportedCredentialMetadata:
        """Create an instance of SupportedCredentialMetadata from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                            "additional_properties"
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in display (list)
        _items = []
        if self.display:
            for _item in self.display:
                if _item:
                    _items.append(_item.to_dict())
            _dict['display'] = _items
        # puts key-value pairs in additional_properties in the top level
        if self.additional_properties is not None:
            for _key, _value in self.additional_properties.items():
                _dict[_key] = _value

        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> SupportedCredentialMetadata:
        """Create an instance of SupportedCredentialMetadata from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return SupportedCredentialMetadata.parse_obj(obj)

        _obj = SupportedCredentialMetadata.parse_obj({
            "display": [SupportedCredentialMetadataDisplayInner.from_dict(_item) for _item in obj.get("display")] if obj.get("display") is not None else None
        })
        # store additional fields in additional_properties
        for _key in obj.keys():
            if _key not in cls.__properties:
                _obj.additional_properties[_key] = obj.get(_key)

        return _obj


