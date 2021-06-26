/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model.server;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PatientLocatedWith
 * <pre><code>
 * {
 *    "contact": {@link Contact},
 *    "address": {@link CivicAddress},
 *    "emergencyContact": {@link Contact}
 * }
 * </code></pre>
 */
public class PatientLocatedWith   {
  @JsonProperty("contact")
  private Contact contact = null;

  @JsonProperty("address")
  private CivicAddress address = null;

  @JsonProperty("emergencyContact")
  private Contact emergencyContact = null;

  public PatientLocatedWith() {
  }

  public PatientLocatedWith(Contact contact, CivicAddress address, Contact emergencyContact) {
    this.contact = contact;
    this.address = address;
    this.emergencyContact = emergencyContact;
  }

  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public CivicAddress getAddress() {
    return address;
  }

  public void setAddress(CivicAddress address) {
    this.address = address;
  }

  public Contact getEmergencyContact() {
    return emergencyContact;
  }

  public void setEmergencyContact(Contact emergencyContact) {
    this.emergencyContact = emergencyContact;
  }
}
