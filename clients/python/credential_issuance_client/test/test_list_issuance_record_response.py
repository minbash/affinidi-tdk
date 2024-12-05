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

from affinidi_tdk_credential_issuance_client.models.list_issuance_record_response import ListIssuanceRecordResponse  # noqa: E501

class TestListIssuanceRecordResponse(unittest.TestCase):
    """ListIssuanceRecordResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ListIssuanceRecordResponse:
        """Test ListIssuanceRecordResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ListIssuanceRecordResponse`
        """
        model = ListIssuanceRecordResponse()  # noqa: E501
        if include_optional:
            return ListIssuanceRecordResponse(
                flow_data = [
                    affinidi_tdk_credential_issuance_client.models.flow_data.FlowData(
                        created_at = '', 
                        modified_at = '', 
                        id = '', 
                        project_id = '', 
                        flow_id = '', 
                        credential_type_id = '', 
                        json_ld_context_url = '', 
                        json_schema_url = '', 
                        configuration_id = '', 
                        issued_at = '', 
                        wallet_id = '', 
                        project_id_configuration_id = '', 
                        project_id_configuration_id_wallet_id = '', 
                        project_id_configuration_id_credential_type = '', 
                        status_lists_details = [
                            affinidi_tdk_credential_issuance_client.models.flow_data_status_lists_details_inner.FlowData_statusListsDetails_inner(
                                status_list_purpose = 'REVOKED', 
                                status_list_id = '', 
                                status_list_index = '', 
                                standard = 'RevocationList2020', 
                                is_active = True, 
                                status_activation_reason = '', 
                                status_activated_at = '', )
                            ], )
                    ],
                last_evaluated_key = ''
            )
        else:
            return ListIssuanceRecordResponse(
        )
        """

    def testListIssuanceRecordResponse(self):
        """Test ListIssuanceRecordResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
