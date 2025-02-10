/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * PatientLocatedWith
 * <pre><code>
 * {
 *    "contact": {@link Contact},
 *    "address": {@link CivicAddress},
 *    "emergency": [{@link Contact}]
 *    "guardian": [{@link Contact}]
 * }
 * </code></pre>
 */
public class LocatedWith {
  @JsonProperty("contact")
  private Contact contact = null;

  @JsonProperty("address")
  private CivicAddress address = null;

  @JsonProperty("emergency")
  private List<Contact> emergency = null;

  @JsonProperty("guardian")
  private List<Guardian> guardian = null;

  public LocatedWith() {
  }

  public LocatedWith(Contact contact, CivicAddress address, List<Contact> emergency, List<Guardian> guardian) {
    this.contact = contact;
    this.address = address;
    this.emergency = emergency;
    this.guardian = guardian;
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

  public List<Contact> getEmergency() {
    return emergency;
  }

  public void setEmergency(List<Contact> emergency) {
    this.emergency = emergency;
  }

  public List<Guardian> getGuardian() {
    return guardian;
  }

  public void setGuardian(List<Guardian> guardian) {
    this.guardian = guardian;
  }
}
