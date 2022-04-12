/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * PrivateMessageContent
 * <pre><code>
 * {
 *    "messageContext": "\"Telemedicine note\", or \"Lab result annotation\"",
 *    "subject": "Results of exam 73",
 *    "text": "Please find in attachment the result of your last month exam.",
 *    "attachments": [
 *      {@link PrivateMessageAttachment}1,
 *      {@link PrivateMessageAttachment}2,
 *      ...
 *      {@link PrivateMessageAttachment}N,
 *    ]
 * }
 * </code></pre>
 */
public class PrivateMessageContent   {
  @JsonProperty("messageContext")
  private String messageContext = null;

  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("attachments")
  private List<PrivateMessageAttachment> attachments = null;

  public PrivateMessageContent() {
  }

  public PrivateMessageContent(String messageContext, String subject, String text, List<PrivateMessageAttachment> attachments) {
    this.messageContext = messageContext;
    this.subject = subject;
    this.text = text;
    this.attachments = attachments;
  }

  public String getMessageContext() {
    return messageContext;
  }

  public void setMessageContext(String messageContext) {
    this.messageContext = messageContext;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public List<PrivateMessageAttachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<PrivateMessageAttachment> attachments) {
    this.attachments = attachments;
  }
}
