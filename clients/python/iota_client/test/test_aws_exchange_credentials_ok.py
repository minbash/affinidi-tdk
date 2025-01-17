# coding: utf-8

"""
    IotaService

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0.0
    Contact: info@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from affinidi_tdk_iota_client.models.aws_exchange_credentials_ok import AwsExchangeCredentialsOK  # noqa: E501

class TestAwsExchangeCredentialsOK(unittest.TestCase):
    """AwsExchangeCredentialsOK unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AwsExchangeCredentialsOK:
        """Test AwsExchangeCredentialsOK
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AwsExchangeCredentialsOK`
        """
        model = AwsExchangeCredentialsOK()  # noqa: E501
        if include_optional:
            return AwsExchangeCredentialsOK(
                connection_client_id = '',
                credentials = affinidi_tdk_iota_client.models.aws_exchange_credentials_project_token_ok_credentials.AwsExchangeCredentialsProjectTokenOK_credentials(
                    identity_id = '', 
                    token = '', )
            )
        else:
            return AwsExchangeCredentialsOK(
                connection_client_id = '',
                credentials = affinidi_tdk_iota_client.models.aws_exchange_credentials_project_token_ok_credentials.AwsExchangeCredentialsProjectTokenOK_credentials(
                    identity_id = '', 
                    token = '', ),
        )
        """

    def testAwsExchangeCredentialsOK(self):
        """Test AwsExchangeCredentialsOK"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
