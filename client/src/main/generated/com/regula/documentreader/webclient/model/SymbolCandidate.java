/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 5.5.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** Describes an individual character recognition candidate */
public class SymbolCandidate {
  public static final String SERIALIZED_NAME_SYMBOL_CODE = "SymbolCode";

  @SerializedName(SERIALIZED_NAME_SYMBOL_CODE)
  private Integer symbolCode;

  public static final String SERIALIZED_NAME_SYMBOL_PROBABILITY = "SymbolProbability";

  @SerializedName(SERIALIZED_NAME_SYMBOL_PROBABILITY)
  private Integer symbolProbability;

  public SymbolCandidate withSymbolCode(Integer symbolCode) {
    this.symbolCode = symbolCode;
    return this;
  }

  /**
   * Unicode symbol code
   *
   * @return symbolCode
   */
  public Integer getSymbolCode() {
    return symbolCode;
  }

  public void setSymbolCode(Integer symbolCode) {
    this.symbolCode = symbolCode;
  }

  public SymbolCandidate withSymbolProbability(Integer symbolProbability) {
    this.symbolProbability = symbolProbability;
    return this;
  }

  /**
   * character recognition probability (0–100,%) minimum: 0 maximum: 100
   *
   * @return symbolProbability
   */
  public Integer getSymbolProbability() {
    return symbolProbability;
  }

  public void setSymbolProbability(Integer symbolProbability) {
    this.symbolProbability = symbolProbability;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SymbolCandidate symbolCandidate = (SymbolCandidate) o;
    return Objects.equals(this.symbolCode, symbolCandidate.symbolCode)
        && Objects.equals(this.symbolProbability, symbolCandidate.symbolProbability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbolCode, symbolProbability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SymbolCandidate {\n");
    sb.append("    symbolCode: ").append(toIndentedString(symbolCode)).append("\n");
    sb.append("    symbolProbability: ").append(toIndentedString(symbolProbability)).append("\n");
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
