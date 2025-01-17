# coding: utf-8

"""
    VaultFileSystem

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.0
    Contact: info@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from affinidi_tdk_vault_data_manager_client.models.json_web_key_set_dto import JsonWebKeySetDto  # noqa: E501

class TestJsonWebKeySetDto(unittest.TestCase):
    """JsonWebKeySetDto unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> JsonWebKeySetDto:
        """Test JsonWebKeySetDto
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `JsonWebKeySetDto`
        """
        model = JsonWebKeySetDto()  # noqa: E501
        if include_optional:
            return JsonWebKeySetDto(
                keys = [
                    affinidi_tdk_vault_data_manager_client.models.json_web_key_dto.JsonWebKeyDto(
                        kid = '', 
                        kty = '', 
                        n = '', 
                        e = '', 
                        x = '', 
                        y = '', 
                        crv = '', 
                        alg = '', 
                        use = '', )
                    ]
            )
        else:
            return JsonWebKeySetDto(
                keys = [
                    affinidi_tdk_vault_data_manager_client.models.json_web_key_dto.JsonWebKeyDto(
                        kid = '', 
                        kty = '', 
                        n = '', 
                        e = '', 
                        x = '', 
                        y = '', 
                        crv = '', 
                        alg = '', 
                        use = '', )
                    ],
        )
        """

    def testJsonWebKeySetDto(self):
        """Test JsonWebKeySetDto"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
