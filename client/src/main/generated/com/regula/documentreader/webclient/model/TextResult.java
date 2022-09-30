/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 6.5.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** TextResult */
public class TextResult extends ResultItem {
  public static final String SERIALIZED_NAME_TEXT = "Text";

  @SerializedName(SERIALIZED_NAME_TEXT)
  private com.regula.documentreader.webclient.model.ext.Text text;

  public TextResult withText(com.regula.documentreader.webclient.model.ext.Text text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   *
   * @return text
   */
  public com.regula.documentreader.webclient.model.ext.Text getText() {
    return text;
  }

  public void setText(com.regula.documentreader.webclient.model.ext.Text text) {
    this.text = text;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextResult textResult = (TextResult) o;
    return Objects.equals(this.text, textResult.text) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
