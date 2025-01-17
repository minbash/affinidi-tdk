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

from affinidi_tdk_credential_issuance_client.models.change_credential_status_input import ChangeCredentialStatusInput  # noqa: E501

class TestChangeCredentialStatusInput(unittest.TestCase):
    """ChangeCredentialStatusInput unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ChangeCredentialStatusInput:
        """Test ChangeCredentialStatusInput
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ChangeCredentialStatusInput`
        """
        model = ChangeCredentialStatusInput()  # noqa: E501
        if include_optional:
            return ChangeCredentialStatusInput(
                change_reason = 'INVALID_CREDENTIAL',
                issuance_record_id = ''
            )
        else:
            return ChangeCredentialStatusInput(
        )
        """

    def testChangeCredentialStatusInput(self):
        """Test ChangeCredentialStatusInput"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
