/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model.server;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

/**
 * Contact for the Patient.
 */
public class Contact   {
  @JsonProperty("feedItemId")
  private UUID feedItemId = null;

  @JsonProperty("backendItemId")
  private UUID backendItemId = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("middleName")
  private String middleName = null;

  @JsonProperty("preferredGender")
  private GenderEnum preferredGender = null;

  @JsonProperty("preferredLanguage")
  private PreferredLanguageEnum preferredLanguage = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("alternateEmail")
  private String alternateEmail = null;

  @JsonProperty("mobilePhone")
  private String mobilePhone = null;

  @JsonProperty("landPhone")
  private String landPhone = null;

  @JsonProperty("fax")
  private String fax = null;

  @JsonProperty("professionalSalutation")
  private String professionalSalutation = null;

  @JsonProperty("salutation")
  private String salutation = null;

  @JsonProperty("titles")
  private String titles = null;

  public Contact() {
  }

  public Contact(UUID feedItemId, UUID backendItemId, String lastName, String firstName, String middleName, GenderEnum preferredGender, PreferredLanguageEnum preferredLanguage, String email, String alternateEmail, String mobilePhone, String landPhone, String fax, String professionalSalutation, String salutation, String titles) {
    this.feedItemId = feedItemId;
    this.backendItemId = backendItemId;
    this.lastName = lastName;
    this.firstName = firstName;
    this.middleName = middleName;
    this.preferredGender = preferredGender;
    this.preferredLanguage = preferredLanguage;
    this.email = email;
    this.alternateEmail = alternateEmail;
    this.mobilePhone = mobilePhone;
    this.landPhone = landPhone;
    this.fax = fax;
    this.professionalSalutation = professionalSalutation;
    this.salutation = salutation;
    this.titles = titles;
  }

  public UUID getFeedItemId() {
    return feedItemId;
  }

  public void setFeedItemId(UUID feedItemId) {
    this.feedItemId = feedItemId;
  }

  public UUID getBackendItemId() {
    return backendItemId;
  }

  public void setBackendItemId(UUID backendItemId) {
    this.backendItemId = backendItemId;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public GenderEnum getPreferredGender() {
    return preferredGender;
  }

  public void setPreferredGender(GenderEnum preferredGender) {
    this.preferredGender = preferredGender;
  }

  public PreferredLanguageEnum getPreferredLanguage() {
    return preferredLanguage;
  }

  public void setPreferredLanguage(PreferredLanguageEnum preferredLanguage) {
    this.preferredLanguage = preferredLanguage;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAlternateEmail() {
    return alternateEmail;
  }

  public void setAlternateEmail(String alternateEmail) {
    this.alternateEmail = alternateEmail;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }

  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }

  public String getLandPhone() {
    return landPhone;
  }

  public void setLandPhone(String landPhone) {
    this.landPhone = landPhone;
  }

  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public String getProfessionalSalutation() {
    return professionalSalutation;
  }

  public void setProfessionalSalutation(String professionalSalutation) {
    this.professionalSalutation = professionalSalutation;
  }

  public String getSalutation() {
    return salutation;
  }

  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }

  public String getTitles() {
    return titles;
  }

  public void setTitles(String titles) {
    this.titles = titles;
  }
}
