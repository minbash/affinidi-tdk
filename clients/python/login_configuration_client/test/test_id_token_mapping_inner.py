# coding: utf-8

"""
    OidcVpAdapterBackend

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.0
    Contact: info@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from affinidi_tdk_login_configuration_client.models.id_token_mapping_inner import IdTokenMappingInner  # noqa: E501

class TestIdTokenMappingInner(unittest.TestCase):
    """IdTokenMappingInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> IdTokenMappingInner:
        """Test IdTokenMappingInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `IdTokenMappingInner`
        """
        model = IdTokenMappingInner()  # noqa: E501
        if include_optional:
            return IdTokenMappingInner(
                source_field = '',
                id_token_claim = '',
                input_descriptor_id = ''
            )
        else:
            return IdTokenMappingInner(
                source_field = '',
                id_token_claim = '',
        )
        """

    def testIdTokenMappingInner(self):
        """Test IdTokenMappingInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
