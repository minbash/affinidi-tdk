/*
 * CloudWalletEssentials
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@affinidi.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.affinidi.tdk.wallets.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.affinidi.tdk.wallets.client.models.WalletDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * list of wallets
 */
@JsonPropertyOrder({ WalletsListDto.JSON_PROPERTY_WALLETS })
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.9.0")
public class WalletsListDto {
    public static final String JSON_PROPERTY_WALLETS = "wallets";
    private List<WalletDto> wallets = new ArrayList<>();

    public WalletsListDto() {
    }

    public WalletsListDto wallets(List<WalletDto> wallets) {

        this.wallets = wallets;
        return this;
    }

    public WalletsListDto addWalletsItem(WalletDto walletsItem) {
        if (this.wallets == null) {
            this.wallets = new ArrayList<>();
        }
        this.wallets.add(walletsItem);
        return this;
    }

    /**
     * Get wallets
     *
     * @return wallets
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_WALLETS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<WalletDto> getWallets() {
        return wallets;
    }

    @JsonProperty(JSON_PROPERTY_WALLETS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWallets(List<WalletDto> wallets) {
        this.wallets = wallets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WalletsListDto walletsListDto = (WalletsListDto) o;
        return Objects.equals(this.wallets, walletsListDto.wallets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wallets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WalletsListDto {\n");
        sb.append("    wallets: ").append(toIndentedString(wallets)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Convert the instance into URL query string.
     *
     * @return URL query string
     */
    public String toUrlQueryString() {
        return toUrlQueryString(null);
    }

    /**
     * Convert the instance into URL query string.
     *
     * @param prefix
     *            prefix of the query string
     *
     * @return URL query string
     */
    public String toUrlQueryString(String prefix) {
        String suffix = "";
        String containerSuffix = "";
        String containerPrefix = "";
        if (prefix == null) {
            // style=form, explode=true, e.g. /pet?name=cat&type=manx
            prefix = "";
        } else {
            // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
            prefix = prefix + "[";
            suffix = "]";
            containerSuffix = "]";
            containerPrefix = "[";
        }

        StringJoiner joiner = new StringJoiner("&");

        // add `wallets` to the URL query string
        if (getWallets() != null) {
            for (int i = 0; i < getWallets().size(); i++) {
                if (getWallets().get(i) != null) {
                    joiner.add(getWallets().get(i).toUrlQueryString(String.format("%swallets%s%s", prefix, suffix,
                            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
                }
            }
        }

        return joiner.toString();
    }

}
