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
import java.util.Objects;

/** Text fields from document OCR with symbol probabilities */
public class VisualOcrExtendedResult extends ResultItem {
  public static final String SERIALIZED_NAME_DOC_VISUAL_EXTENDED_INFO = "DocVisualExtendedInfo";

  @SerializedName(SERIALIZED_NAME_DOC_VISUAL_EXTENDED_INFO)
  private DocVisualExtendedInfo docVisualExtendedInfo;

  public VisualOcrExtendedResult withDocVisualExtendedInfo(
      DocVisualExtendedInfo docVisualExtendedInfo) {
    this.docVisualExtendedInfo = docVisualExtendedInfo;
    return this;
  }

  /**
   * Get docVisualExtendedInfo
   *
   * @return docVisualExtendedInfo
   */
  @javax.annotation.Nullable
  public DocVisualExtendedInfo getDocVisualExtendedInfo() {
    return docVisualExtendedInfo;
  }

  public void setDocVisualExtendedInfo(DocVisualExtendedInfo docVisualExtendedInfo) {
    this.docVisualExtendedInfo = docVisualExtendedInfo;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VisualOcrExtendedResult visualOcrExtendedResult = (VisualOcrExtendedResult) o;
    return Objects.equals(this.docVisualExtendedInfo, visualOcrExtendedResult.docVisualExtendedInfo)
        && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docVisualExtendedInfo, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VisualOcrExtendedResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    docVisualExtendedInfo: ")
        .append(toIndentedString(docVisualExtendedInfo))
        .append("\n");
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