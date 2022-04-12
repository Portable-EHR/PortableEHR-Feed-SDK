/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model;

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
public class ClientLocatedWith {
  @JsonProperty("contact")
  private Contact contact = null;

  @JsonProperty("address")
  private CivicAddress address = null;

  @JsonProperty("emergencyContact")
  private EmergencyContact emergencyContact = null;

  public ClientLocatedWith() {
  }

  public ClientLocatedWith(Contact contact, CivicAddress address, EmergencyContact emergencyContact) {
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

  public EmergencyContact getEmergencyContact() {
    return emergencyContact;
  }

  public void setEmergencyContact(EmergencyContact emergencyContact) {
    this.emergencyContact = emergencyContact;
  }
}
