# coding: utf-8

"""
    IotaService

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
from pydantic import BaseModel, Field, StrictStr

class SavePexQueriesUpdateInputQueriesInner(BaseModel):
    """
    SavePexQueriesUpdateInputQueriesInner
    """
    query_id: StrictStr = Field(default=..., alias="queryId", description="The ID of the query.")
    vp_definition: Optional[StrictStr] = Field(default=None, alias="vpDefinition", description="The presentation definition describing the data requirement that must be satisfied by the user. The value is in a JSON stringify format.")
    description: Optional[StrictStr] = Field(default=None, description="An optional description of what the query is used for.")
    __properties = ["queryId", "vpDefinition", "description"]

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
    def from_json(cls, json_str: str) -> SavePexQueriesUpdateInputQueriesInner:
        """Create an instance of SavePexQueriesUpdateInputQueriesInner from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> SavePexQueriesUpdateInputQueriesInner:
        """Create an instance of SavePexQueriesUpdateInputQueriesInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return SavePexQueriesUpdateInputQueriesInner.parse_obj(obj)

        _obj = SavePexQueriesUpdateInputQueriesInner.parse_obj({
            "query_id": obj.get("queryId"),
            "vp_definition": obj.get("vpDefinition"),
            "description": obj.get("description")
        })
        return _obj


