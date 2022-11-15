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

public class DocumentFormat {

  /** ID1 document format */
  public static final int ID1 = 0;

  /** ID2 document format */
  public static final int ID2 = 1;

  /** ID3 document format */
  public static final int ID3 = 2;

  /** Undefined document format */
  public static final int NON = 3;

  /** A4 document format */
  public static final int A4 = 4;

  /** ID3 double document format */
  public static final int ID3_X2 = 5;

  /** ID1 format document rotated 90 ° */
  public static final int ID1_90 = 10;

  /** ID1 format document rotated 180 ° */
  public static final int ID1_180 = 11;

  /** ID1 format document rotated 270 ° */
  public static final int ID1_270 = 12;

  /** ID2 format document rotated 90 ° */
  public static final int ID2_180 = 13;

  /** ID3 format document rotated 180 ° */
  public static final int ID3_180 = 14;

  /** Arbitrary format */
  public static final int CUSTOM = 1000;

  /**
   * Flexible format. Standard formats can be resized during cropping, depending on various factors:
   * light, background...
   */
  public static final int FLEXIBLE = 1002;
}
