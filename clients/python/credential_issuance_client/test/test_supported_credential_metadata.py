# coding: utf-8

"""
    CredentialIssuanceService

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.0
    Contact: info@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from affinidi_tdk_credential_issuance_client.models.supported_credential_metadata import SupportedCredentialMetadata  # noqa: E501

class TestSupportedCredentialMetadata(unittest.TestCase):
    """SupportedCredentialMetadata unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> SupportedCredentialMetadata:
        """Test SupportedCredentialMetadata
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `SupportedCredentialMetadata`
        """
        model = SupportedCredentialMetadata()  # noqa: E501
        if include_optional:
            return SupportedCredentialMetadata(
                display = [
                    { }
                    ]
            )
        else:
            return SupportedCredentialMetadata(
        )
        """

    def testSupportedCredentialMetadata(self):
        """Test SupportedCredentialMetadata"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
