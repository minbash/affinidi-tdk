# StartIssuanceInput_data_inner

## Properties

| Name                  | Type                                                                                    | Description                                                                                                                                                  | Notes                        |
| --------------------- | --------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ---------------------------- |
| **credentialTypeId**  | **String**                                                                              | It is a String that identifies a Credential that is being requested to be issued.                                                                            | [default to null]            |
| **credentialData**    | [**Map**](AnyType.md)                                                                   | Object of data to be included in the issued credential ,should match the credential type                                                                     | [default to null]            |
| **statusListDetails** | [**List**](StartIssuanceInput_data_inner_statusListDetails_inner.md)                    | Types of status lists to which the credential should be added once issued. If not provided or empty, the credential is not added to any of the status lists. | [optional] [default to null] |
| **metaData**          | [**StartIssuanceInput_data_inner_metaData**](StartIssuanceInput_data_inner_metaData.md) |                                                                                                                                                              | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
