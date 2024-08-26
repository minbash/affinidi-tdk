# coding: utf-8

"""
    CredentialIssuanceService

    Affinidi Credential Issuance Service Structure

    The version of the OpenAPI document: 1.0.0
    Contact: info@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from affinidi_tdk_credential_issuance_client.models.credential_supported_object import CredentialSupportedObject  # noqa: E501

class TestCredentialSupportedObject(unittest.TestCase):
    """CredentialSupportedObject unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CredentialSupportedObject:
        """Test CredentialSupportedObject
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CredentialSupportedObject`
        """
        model = CredentialSupportedObject()  # noqa: E501
        if include_optional:
            return CredentialSupportedObject(
                credential_type_id = '',
                json_schema_url = 'https://j.json',
                json_ld_context_url = 'https://j.jsonld',
                metadata = { }
            )
        else:
            return CredentialSupportedObject(
                credential_type_id = '',
                json_schema_url = 'https://j.json',
                json_ld_context_url = 'https://j.jsonld',
        )
        """

    def testCredentialSupportedObject(self):
        """Test CredentialSupportedObject"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
