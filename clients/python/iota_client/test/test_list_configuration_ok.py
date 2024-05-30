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

from affinidi_tdk_iota_client.models.list_configuration_ok import ListConfigurationOK  # noqa: E501

class TestListConfigurationOK(unittest.TestCase):
    """ListConfigurationOK unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ListConfigurationOK:
        """Test ListConfigurationOK
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ListConfigurationOK`
        """
        model = ListConfigurationOK()  # noqa: E501
        if include_optional:
            return ListConfigurationOK(
                configurations = [
                    affinidi_tdk_iota_client.models.iota_configuration_dto.IotaConfigurationDto(
                        ari = '', 
                        configuration_id = '', 
                        name = '', 
                        project_id = '', 
                        wallet_ari = '', 
                        token_max_age = 1.337, 
                        iota_response_webhook_url = '', 
                        enable_verification = True, 
                        enable_consent_audit_log = True, 
                        client_metadata = { }, )
                    ]
            )
        else:
            return ListConfigurationOK(
                configurations = [
                    affinidi_tdk_iota_client.models.iota_configuration_dto.IotaConfigurationDto(
                        ari = '', 
                        configuration_id = '', 
                        name = '', 
                        project_id = '', 
                        wallet_ari = '', 
                        token_max_age = 1.337, 
                        iota_response_webhook_url = '', 
                        enable_verification = True, 
                        enable_consent_audit_log = True, 
                        client_metadata = { }, )
                    ],
        )
        """

    def testListConfigurationOK(self):
        """Test ListConfigurationOK"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
