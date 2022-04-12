/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * PrivateMessageAttachment
 * <pre><code>
 *  {
 *    "name": "Exam 73 result",
 *    "date": "2021-02-12",
 *    "mimeType": "application/pdf",
 *    "ext": "pdf",
 *    "docAsB64": "JVBERi0xLjQKJcOkw7zDtsOfCjIgMCBvYmoKPDwvTGVuZ3RoIDMgMCBSL0ZpbHRlci9GbGF0ZURlY29kZT4-CnN0..."
 * }
 * </code></pre>
 */
public class PrivateMessageAttachment   {
  @JsonProperty("name")
  private String name = null;

  /* Date of original creation of this attached document.*/
  @JsonProperty("date")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date date = null;

  @JsonProperty("mimeType")
  private String mimeType = null;

  @JsonProperty("ext")
  private String ext = null;

  @JsonProperty("docAsB64")
  private String docAsB64 = null;

  public PrivateMessageAttachment() {
  }

  public PrivateMessageAttachment(String name, Date date, String mimeType, String ext, String docAsB64) {
    this.name = name;
    this.date = date;
    this.mimeType = mimeType;
    this.ext = ext;
    this.docAsB64 = docAsB64;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public String getExt() {
    return ext;
  }

  public void setExt(String ext) {
    this.ext = ext;
  }

  public String getDocAsB64() {
    return docAsB64;
  }

  public void setDocAsB64(String docAsB64) {
    this.docAsB64 = docAsB64;
  }
}
