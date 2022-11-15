/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 6.6.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.Objects;

/** Contains information about one document type candidate */
public class ChosenDocumentType {
  public static final String SERIALIZED_NAME_DOCUMENT_NAME = "DocumentName";

  @SerializedName(SERIALIZED_NAME_DOCUMENT_NAME)
  private String documentName;

  public static final String SERIALIZED_NAME_I_D = "ID";

  @SerializedName(SERIALIZED_NAME_I_D)
  private Integer ID;

  public static final String SERIALIZED_NAME_P = "P";

  @SerializedName(SERIALIZED_NAME_P)
  private BigDecimal P;

  public static final String SERIALIZED_NAME_RF_I_D_PRESENCE = "RFID_Presence";

  @SerializedName(SERIALIZED_NAME_RF_I_D_PRESENCE)
  private Integer rfIDPresence;

  public static final String SERIALIZED_NAME_FD_S_I_D_LIST = "FDSIDList";

  @SerializedName(SERIALIZED_NAME_FD_S_I_D_LIST)
  private FDSIDList fdSIDList;

  public static final String SERIALIZED_NAME_NECESSARY_LIGHTS = "NecessaryLights";

  @SerializedName(SERIALIZED_NAME_NECESSARY_LIGHTS)
  private Integer necessaryLights;

  public static final String SERIALIZED_NAME_CHECK_AUTHENTICITY = "CheckAuthenticity";

  @SerializedName(SERIALIZED_NAME_CHECK_AUTHENTICITY)
  private Integer checkAuthenticity;

  public static final String SERIALIZED_NAME_UV_EXP = "UVExp";

  @SerializedName(SERIALIZED_NAME_UV_EXP)
  private Integer uvExp;

  public static final String SERIALIZED_NAME_AUTHENTICITY_NECESSARY_LIGHTS =
      "AuthenticityNecessaryLights";

  @SerializedName(SERIALIZED_NAME_AUTHENTICITY_NECESSARY_LIGHTS)
  private Integer authenticityNecessaryLights;

  public ChosenDocumentType withDocumentName(String documentName) {
    this.documentName = documentName;
    return this;
  }

  /**
   * Document name
   *
   * @return documentName
   */
  @javax.annotation.Nullable
  public String getDocumentName() {
    return documentName;
  }

  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }

  public ChosenDocumentType withID(Integer ID) {
    this.ID = ID;
    return this;
  }

  /**
   * Unique document type template identifier (Regula&#39;s internal numeric code)
   *
   * @return ID
   */
  @javax.annotation.Nullable
  public Integer getID() {
    return ID;
  }

  public void setID(Integer ID) {
    this.ID = ID;
  }

  public ChosenDocumentType withP(BigDecimal P) {
    this.P = P;
    return this;
  }

  /**
   * A measure of the likelihood of correct recognition in the analysis of this type of document
   * minimum: 0 maximum: 1
   *
   * @return P
   */
  @javax.annotation.Nullable
  public BigDecimal getP() {
    return P;
  }

  public void setP(BigDecimal P) {
    this.P = P;
  }

  public ChosenDocumentType withRfIDPresence(Integer rfIDPresence) {
    this.rfIDPresence = rfIDPresence;
    return this;
  }

  /**
   * Get rfIDPresence
   *
   * @return rfIDPresence
   */
  @javax.annotation.Nullable
  public Integer getRfIDPresence() {
    return rfIDPresence;
  }

  public void setRfIDPresence(Integer rfIDPresence) {
    this.rfIDPresence = rfIDPresence;
  }

  public ChosenDocumentType withFdSIDList(FDSIDList fdSIDList) {
    this.fdSIDList = fdSIDList;
    return this;
  }

  /**
   * Get fdSIDList
   *
   * @return fdSIDList
   */
  @javax.annotation.Nullable
  public FDSIDList getFdSIDList() {
    return fdSIDList;
  }

  public void setFdSIDList(FDSIDList fdSIDList) {
    this.fdSIDList = fdSIDList;
  }

  public ChosenDocumentType withNecessaryLights(Integer necessaryLights) {
    this.necessaryLights = necessaryLights;
    return this;
  }

  /**
   * Combination of lighting scheme identifiers (Light enum) required to conduct OCR for this type
   * of document
   *
   * @return necessaryLights
   */
  @javax.annotation.Nullable
  public Integer getNecessaryLights() {
    return necessaryLights;
  }

  public void setNecessaryLights(Integer necessaryLights) {
    this.necessaryLights = necessaryLights;
  }

  public ChosenDocumentType withCheckAuthenticity(Integer checkAuthenticity) {
    this.checkAuthenticity = checkAuthenticity;
    return this;
  }

  /**
   * Set of authentication options provided for this type of document (combination of Authenticity
   * enum)
   *
   * @return checkAuthenticity
   */
  @javax.annotation.Nullable
  public Integer getCheckAuthenticity() {
    return checkAuthenticity;
  }

  public void setCheckAuthenticity(Integer checkAuthenticity) {
    this.checkAuthenticity = checkAuthenticity;
  }

  public ChosenDocumentType withUvExp(Integer uvExp) {
    this.uvExp = uvExp;
    return this;
  }

  /**
   * The required exposure value of the camera when receiving images of a document of this type for
   * a UV lighting scheme
   *
   * @return uvExp
   */
  @javax.annotation.Nullable
  public Integer getUvExp() {
    return uvExp;
  }

  public void setUvExp(Integer uvExp) {
    this.uvExp = uvExp;
  }

  public ChosenDocumentType withAuthenticityNecessaryLights(Integer authenticityNecessaryLights) {
    this.authenticityNecessaryLights = authenticityNecessaryLights;
    return this;
  }

  /**
   * Combination of lighting scheme identifiers (combination of Light enum) needed to perform all
   * authenticity checks specified in CheckAuthenticity
   *
   * @return authenticityNecessaryLights
   */
  @javax.annotation.Nullable
  public Integer getAuthenticityNecessaryLights() {
    return authenticityNecessaryLights;
  }

  public void setAuthenticityNecessaryLights(Integer authenticityNecessaryLights) {
    this.authenticityNecessaryLights = authenticityNecessaryLights;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChosenDocumentType chosenDocumentType = (ChosenDocumentType) o;
    return Objects.equals(this.documentName, chosenDocumentType.documentName)
        && Objects.equals(this.ID, chosenDocumentType.ID)
        && Objects.equals(this.P, chosenDocumentType.P)
        && Objects.equals(this.rfIDPresence, chosenDocumentType.rfIDPresence)
        && Objects.equals(this.fdSIDList, chosenDocumentType.fdSIDList)
        && Objects.equals(this.necessaryLights, chosenDocumentType.necessaryLights)
        && Objects.equals(this.checkAuthenticity, chosenDocumentType.checkAuthenticity)
        && Objects.equals(this.uvExp, chosenDocumentType.uvExp)
        && Objects.equals(
            this.authenticityNecessaryLights, chosenDocumentType.authenticityNecessaryLights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        documentName,
        ID,
        P,
        rfIDPresence,
        fdSIDList,
        necessaryLights,
        checkAuthenticity,
        uvExp,
        authenticityNecessaryLights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChosenDocumentType {\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    P: ").append(toIndentedString(P)).append("\n");
    sb.append("    rfIDPresence: ").append(toIndentedString(rfIDPresence)).append("\n");
    sb.append("    fdSIDList: ").append(toIndentedString(fdSIDList)).append("\n");
    sb.append("    necessaryLights: ").append(toIndentedString(necessaryLights)).append("\n");
    sb.append("    checkAuthenticity: ").append(toIndentedString(checkAuthenticity)).append("\n");
    sb.append("    uvExp: ").append(toIndentedString(uvExp)).append("\n");
    sb.append("    authenticityNecessaryLights: ")
        .append(toIndentedString(authenticityNecessaryLights))
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
