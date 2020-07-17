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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Extended document type info and Regula&#39;s &#39;Information Reference Systems&#39; links */
public class TFDSIDList {
  public static final String SERIALIZED_NAME_I_C_A_O = "ICAO";

  @SerializedName(SERIALIZED_NAME_I_C_A_O)
  private String ICAO;

  public static final String SERIALIZED_NAME_LIST = "List";

  @SerializedName(SERIALIZED_NAME_LIST)
  private List<Integer> list = null;

  public static final String SERIALIZED_NAME_D_TYPE = "dType";

  @SerializedName(SERIALIZED_NAME_D_TYPE)
  private DocumentType dType;

  public static final String SERIALIZED_NAME_D_FORMAT = "dFormat";

  @SerializedName(SERIALIZED_NAME_D_FORMAT)
  private int dFormat;

  public static final String SERIALIZED_NAME_D_M_R_Z = "dMRZ";

  @SerializedName(SERIALIZED_NAME_D_M_R_Z)
  private Boolean dMRZ;

  public static final String SERIALIZED_NAME_D_DESCRIPTION = "dDescription";

  @SerializedName(SERIALIZED_NAME_D_DESCRIPTION)
  private String dDescription;

  public static final String SERIALIZED_NAME_D_YEAR = "dYear";

  @SerializedName(SERIALIZED_NAME_D_YEAR)
  private String dYear;

  public static final String SERIALIZED_NAME_D_COUNTRY_NAME = "dCountryName";

  @SerializedName(SERIALIZED_NAME_D_COUNTRY_NAME)
  private String dCountryName;

  public static final String SERIALIZED_NAME_D_STATE_CODE = "dStateCode";

  @SerializedName(SERIALIZED_NAME_D_STATE_CODE)
  private String dStateCode;

  public static final String SERIALIZED_NAME_D_STATE_NAME = "dStateName";

  @SerializedName(SERIALIZED_NAME_D_STATE_NAME)
  private String dStateName;

  public TFDSIDList withICAO(String ICAO) {
    this.ICAO = ICAO;
    return this;
  }

  /**
   * ICAO code of the issuing country
   *
   * @return ICAO
   */
  @javax.annotation.Nullable
  public String getICAO() {
    return ICAO;
  }

  public void setICAO(String ICAO) {
    this.ICAO = ICAO;
  }

  public TFDSIDList withList(List<Integer> list) {
    this.list = list;
    return this;
  }

  public TFDSIDList addListItem(int listItem) {
    if (this.list == null) {
      this.list = new ArrayList<Integer>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * Document identifiers in &#39;Information Reference Systems&#39;
   *
   * @return list
   */
  @javax.annotation.Nullable
  public List<Integer> getList() {
    return list;
  }

  public void setList(List<Integer> list) {
    this.list = list;
  }

  public TFDSIDList withDType(DocumentType dType) {
    this.dType = dType;
    return this;
  }

  /**
   * Get dType
   *
   * @return dType
   */
  @javax.annotation.Nullable
  public DocumentType getdType() {
    return dType;
  }

  public void setdType(DocumentType dType) {
    this.dType = dType;
  }

  public TFDSIDList withDFormat(int dFormat) {
    this.dFormat = dFormat;
    return this;
  }

  /**
   * Get dFormat
   *
   * @return dFormat
   */
  @javax.annotation.Nullable
  public int getdFormat() {
    return dFormat;
  }

  public void setdFormat(int dFormat) {
    this.dFormat = dFormat;
  }

  public TFDSIDList withDMRZ(Boolean dMRZ) {
    this.dMRZ = dMRZ;
    return this;
  }

  /**
   * Flag indicating the presence of MRZ on the document
   *
   * @return dMRZ
   */
  @javax.annotation.Nullable
  public Boolean getdMRZ() {
    return dMRZ;
  }

  public void setdMRZ(Boolean dMRZ) {
    this.dMRZ = dMRZ;
  }

  public TFDSIDList withDDescription(String dDescription) {
    this.dDescription = dDescription;
    return this;
  }

  /**
   * Document description
   *
   * @return dDescription
   */
  @javax.annotation.Nullable
  public String getdDescription() {
    return dDescription;
  }

  public void setdDescription(String dDescription) {
    this.dDescription = dDescription;
  }

  public TFDSIDList withDYear(String dYear) {
    this.dYear = dYear;
    return this;
  }

  /**
   * Year of publication of the document
   *
   * @return dYear
   */
  @javax.annotation.Nullable
  public String getdYear() {
    return dYear;
  }

  public void setdYear(String dYear) {
    this.dYear = dYear;
  }

  public TFDSIDList withDCountryName(String dCountryName) {
    this.dCountryName = dCountryName;
    return this;
  }

  /**
   * Issuing country name
   *
   * @return dCountryName
   */
  @javax.annotation.Nullable
  public String getdCountryName() {
    return dCountryName;
  }

  public void setdCountryName(String dCountryName) {
    this.dCountryName = dCountryName;
  }

  public TFDSIDList withDStateCode(String dStateCode) {
    this.dStateCode = dStateCode;
    return this;
  }

  /**
   * Issuing state code
   *
   * @return dStateCode
   */
  @javax.annotation.Nullable
  public String getdStateCode() {
    return dStateCode;
  }

  public void setdStateCode(String dStateCode) {
    this.dStateCode = dStateCode;
  }

  public TFDSIDList withDStateName(String dStateName) {
    this.dStateName = dStateName;
    return this;
  }

  /**
   * Issuing state name
   *
   * @return dStateName
   */
  @javax.annotation.Nullable
  public String getdStateName() {
    return dStateName;
  }

  public void setdStateName(String dStateName) {
    this.dStateName = dStateName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TFDSIDList tfDSIDList = (TFDSIDList) o;
    return Objects.equals(this.ICAO, tfDSIDList.ICAO)
        && Objects.equals(this.list, tfDSIDList.list)
        && Objects.equals(this.dType, tfDSIDList.dType)
        && Objects.equals(this.dFormat, tfDSIDList.dFormat)
        && Objects.equals(this.dMRZ, tfDSIDList.dMRZ)
        && Objects.equals(this.dDescription, tfDSIDList.dDescription)
        && Objects.equals(this.dYear, tfDSIDList.dYear)
        && Objects.equals(this.dCountryName, tfDSIDList.dCountryName)
        && Objects.equals(this.dStateCode, tfDSIDList.dStateCode)
        && Objects.equals(this.dStateName, tfDSIDList.dStateName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        ICAO,
        list,
        dType,
        dFormat,
        dMRZ,
        dDescription,
        dYear,
        dCountryName,
        dStateCode,
        dStateName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TFDSIDList {\n");
    sb.append("    ICAO: ").append(toIndentedString(ICAO)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    dType: ").append(toIndentedString(dType)).append("\n");
    sb.append("    dFormat: ").append(toIndentedString(dFormat)).append("\n");
    sb.append("    dMRZ: ").append(toIndentedString(dMRZ)).append("\n");
    sb.append("    dDescription: ").append(toIndentedString(dDescription)).append("\n");
    sb.append("    dYear: ").append(toIndentedString(dYear)).append("\n");
    sb.append("    dCountryName: ").append(toIndentedString(dCountryName)).append("\n");
    sb.append("    dStateCode: ").append(toIndentedString(dStateCode)).append("\n");
    sb.append("    dStateName: ").append(toIndentedString(dStateName)).append("\n");
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