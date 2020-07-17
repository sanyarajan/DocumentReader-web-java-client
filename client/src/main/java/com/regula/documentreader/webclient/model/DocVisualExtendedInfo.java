/*
 * Regula Document Reader Web API
 * Regula Document Reader Web API
 *
 * The version of the OpenAPI document: 5.1.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Container for extracted text fields. Fields are identified by type and language */
public class DocVisualExtendedInfo {
  public static final String SERIALIZED_NAME_P_ARRAY_FIELDS = "pArrayFields";

  @SerializedName(SERIALIZED_NAME_P_ARRAY_FIELDS)
  private List<ExtendedTextField> pArrayFields = null;

  public DocVisualExtendedInfo pArrayFields(List<ExtendedTextField> pArrayFields) {

    this.pArrayFields = pArrayFields;
    return this;
  }

  public DocVisualExtendedInfo addPArrayFieldsItem(ExtendedTextField pArrayFieldsItem) {
    if (this.pArrayFields == null) {
      this.pArrayFields = new ArrayList<ExtendedTextField>();
    }
    this.pArrayFields.add(pArrayFieldsItem);
    return this;
  }

  /**
   * Get pArrayFields
   *
   * @return pArrayFields
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public List<ExtendedTextField> getpArrayFields() {
    return pArrayFields;
  }

  public void setpArrayFields(List<ExtendedTextField> pArrayFields) {
    this.pArrayFields = pArrayFields;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocVisualExtendedInfo docVisualExtendedInfo = (DocVisualExtendedInfo) o;
    return Objects.equals(this.pArrayFields, docVisualExtendedInfo.pArrayFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pArrayFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocVisualExtendedInfo {\n");
    sb.append("    pArrayFields: ").append(toIndentedString(pArrayFields)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}