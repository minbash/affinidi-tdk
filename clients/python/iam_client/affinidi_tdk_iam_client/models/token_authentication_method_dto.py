# coding: utf-8

"""
    Iam

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.0
    Contact: info@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
from inspect import getfullargspec
import json
import pprint
import re  # noqa: F401

from typing import Any, List, Optional
from pydantic import BaseModel, Field, StrictStr, ValidationError, validator
from affinidi_tdk_iam_client.models.token_private_key_authentication_method_dto import TokenPrivateKeyAuthenticationMethodDto
from typing import Union, Any, List, TYPE_CHECKING
from pydantic import StrictStr, Field

TOKENAUTHENTICATIONMETHODDTO_ONE_OF_SCHEMAS = ["TokenPrivateKeyAuthenticationMethodDto"]

class TokenAuthenticationMethodDto(BaseModel):
    """
    How the Token will be authenticate against our Authorization Server
    """
    # data type: TokenPrivateKeyAuthenticationMethodDto
    oneof_schema_1_validator: Optional[TokenPrivateKeyAuthenticationMethodDto] = None
    if TYPE_CHECKING:
        actual_instance: Union[TokenPrivateKeyAuthenticationMethodDto]
    else:
        actual_instance: Any
    one_of_schemas: List[str] = Field(TOKENAUTHENTICATIONMETHODDTO_ONE_OF_SCHEMAS, const=True)

    class Config:
        validate_assignment = True

    def __init__(self, *args, **kwargs) -> None:
        if args:
            if len(args) > 1:
                raise ValueError("If a position argument is used, only 1 is allowed to set `actual_instance`")
            if kwargs:
                raise ValueError("If a position argument is used, keyword arguments cannot be used.")
            super().__init__(actual_instance=args[0])
        else:
            super().__init__(**kwargs)

    @validator('actual_instance')
    def actual_instance_must_validate_oneof(cls, v):
        instance = TokenAuthenticationMethodDto.construct()
        error_messages = []
        match = 0
        # validate data type: TokenPrivateKeyAuthenticationMethodDto
        if not isinstance(v, TokenPrivateKeyAuthenticationMethodDto):
            error_messages.append(f"Error! Input type `{type(v)}` is not `TokenPrivateKeyAuthenticationMethodDto`")
        else:
            match += 1
        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when setting `actual_instance` in TokenAuthenticationMethodDto with oneOf schemas: TokenPrivateKeyAuthenticationMethodDto. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when setting `actual_instance` in TokenAuthenticationMethodDto with oneOf schemas: TokenPrivateKeyAuthenticationMethodDto. Details: " + ", ".join(error_messages))
        else:
            return v

    @classmethod
    def from_dict(cls, obj: dict) -> TokenAuthenticationMethodDto:
        return cls.from_json(json.dumps(obj))

    @classmethod
    def from_json(cls, json_str: str) -> TokenAuthenticationMethodDto:
        """Returns the object represented by the json string"""
        instance = TokenAuthenticationMethodDto.construct()
        error_messages = []
        match = 0

        # deserialize data into TokenPrivateKeyAuthenticationMethodDto
        try:
            instance.actual_instance = TokenPrivateKeyAuthenticationMethodDto.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))

        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when deserializing the JSON string into TokenAuthenticationMethodDto with oneOf schemas: TokenPrivateKeyAuthenticationMethodDto. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when deserializing the JSON string into TokenAuthenticationMethodDto with oneOf schemas: TokenPrivateKeyAuthenticationMethodDto. Details: " + ", ".join(error_messages))
        else:
            return instance

    def to_json(self) -> str:
        """Returns the JSON representation of the actual instance"""
        if self.actual_instance is None:
            return "null"

        to_json = getattr(self.actual_instance, "to_json", None)
        if callable(to_json):
            return self.actual_instance.to_json()
        else:
            return json.dumps(self.actual_instance)

    def to_dict(self) -> dict:
        """Returns the dict representation of the actual instance"""
        if self.actual_instance is None:
            return None

        to_dict = getattr(self.actual_instance, "to_dict", None)
        if callable(to_dict):
            return self.actual_instance.to_dict()
        else:
            # primitive type
            return self.actual_instance

    def to_str(self) -> str:
        """Returns the string representation of the actual instance"""
        return pprint.pformat(self.dict())


