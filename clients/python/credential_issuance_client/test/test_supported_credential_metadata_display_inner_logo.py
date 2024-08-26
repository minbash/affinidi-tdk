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

from affinidi_tdk_credential_issuance_client.models.supported_credential_metadata_display_inner_logo import SupportedCredentialMetadataDisplayInnerLogo  # noqa: E501

class TestSupportedCredentialMetadataDisplayInnerLogo(unittest.TestCase):
    """SupportedCredentialMetadataDisplayInnerLogo unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> SupportedCredentialMetadataDisplayInnerLogo:
        """Test SupportedCredentialMetadataDisplayInnerLogo
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `SupportedCredentialMetadataDisplayInnerLogo`
        """
        model = SupportedCredentialMetadataDisplayInnerLogo()  # noqa: E501
        if include_optional:
            return SupportedCredentialMetadataDisplayInnerLogo(
                url = '',
                alt_text = ''
            )
        else:
            return SupportedCredentialMetadataDisplayInnerLogo(
                url = '',
        )
        """

    def testSupportedCredentialMetadataDisplayInnerLogo(self):
        """Test SupportedCredentialMetadataDisplayInnerLogo"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
