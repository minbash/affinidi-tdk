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


from typing import List
from pydantic import BaseModel, Field, conlist
from affinidi_tdk_iota_client.models.pex_query_dto import PexQueryDto

class ListPexQueriesOK(BaseModel):
    """
    ListPexQueriesOK
    """
    pex_queries: conlist(PexQueryDto) = Field(..., alias="pexQueries")
    __properties = ["pexQueries"]

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
    def from_json(cls, json_str: str) -> ListPexQueriesOK:
        """Create an instance of ListPexQueriesOK from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in pex_queries (list)
        _items = []
        if self.pex_queries:
            for _item in self.pex_queries:
                if _item:
                    _items.append(_item.to_dict())
            _dict['pexQueries'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> ListPexQueriesOK:
        """Create an instance of ListPexQueriesOK from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return ListPexQueriesOK.parse_obj(obj)

        _obj = ListPexQueriesOK.parse_obj({
            "pex_queries": [PexQueryDto.from_dict(_item) for _item in obj.get("pexQueries")] if obj.get("pexQueries") is not None else None
        })
        return _obj


