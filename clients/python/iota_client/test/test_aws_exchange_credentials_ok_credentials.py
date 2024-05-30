# coding: utf-8

"""
    IotaService

    Affinidi IotaService Structure

    The version of the OpenAPI document: 1.0.0
    Contact: nucleus.team@affinidi.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from affinidi_tdk_iota_client.models.aws_exchange_credentials_ok_credentials import AwsExchangeCredentialsOKCredentials  # noqa: E501

class TestAwsExchangeCredentialsOKCredentials(unittest.TestCase):
    """AwsExchangeCredentialsOKCredentials unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> AwsExchangeCredentialsOKCredentials:
        """Test AwsExchangeCredentialsOKCredentials
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AwsExchangeCredentialsOKCredentials`
        """
        model = AwsExchangeCredentialsOKCredentials()  # noqa: E501
        if include_optional:
            return AwsExchangeCredentialsOKCredentials(
                identity_id = '',
                token = ''
            )
        else:
            return AwsExchangeCredentialsOKCredentials(
                identity_id = '',
                token = '',
        )
        """

    def testAwsExchangeCredentialsOKCredentials(self):
        """Test AwsExchangeCredentialsOKCredentials"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
