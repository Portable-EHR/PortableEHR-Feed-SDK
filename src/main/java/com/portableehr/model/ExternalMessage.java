/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExternalMessage
 * <pre><code>
 * {
 *     "feedItemId" : "00000000-0000-0000-0000-000000000000",
 *     "method" : {@link ExternalMessageMethodEnum},
 *     "recipient" : "00000000-0000-0000-0000-000000000000",
 *     "recipientType" : {@link ExternalMessageRecipientTypeEnum},
 *     "body" : "This is the body of the message",
 *     "subject" : "The subject of the email",
 *     "title" : "The title of the push notification"
 * }
 * </code></pre>
 */
public class ExternalMessage {

  @JsonProperty("feedItemId")
  private String feedItemId = null;

  @JsonProperty("method")
  private ExternalMessageMethodEnum method = null;

  @JsonProperty("recipient")
  private String recipient = null;

  @JsonProperty("recipientType")
  private ExternalMessageRecipientTypeEnum recipientType = null;

  @JsonProperty("body")
  private String body = null;

  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("title")
  private String title = null;

  public ExternalMessage() {
  }

  public ExternalMessage(String feedItemId, ExternalMessageMethodEnum method, String recipient, ExternalMessageRecipientTypeEnum recipientType, String body, String subject, String title) {
    this.feedItemId = feedItemId;
    this.method = method;
    this.recipient = recipient;
    this.recipientType = recipientType;
    this.body = body;
    this.subject = subject;
    this.title = title;
  }

  public String getFeedItemId() {
    return feedItemId;
  }

  public void setFeedItemId(String feedItemId) {
    this.feedItemId = feedItemId;
  }

  public ExternalMessageMethodEnum getMethod() {
    return method;
  }

  public void setMethod(ExternalMessageMethodEnum method) {
    this.method = method;
  }

  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public ExternalMessageRecipientTypeEnum getRecipientType() {
    return recipientType;
  }

  public void setRecipientType(ExternalMessageRecipientTypeEnum recipientType) {
    this.recipientType = recipientType;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
