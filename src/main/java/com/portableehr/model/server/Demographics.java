/*
 * Copyright © Portable EHR inc, 2021
 * https://portableehr.com/
 */

package com.portableehr.model.server;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * PatientDemographics
 * <pre><code>
 *  {
 *       "dateOfBirth": "1955-04-15",
 *       "gender": {@link GenderEnum},
 *       "genderAtBirth": {@link GenderEnum},
 *       "name": {@link DemographicsName},
 *       "nameAtBirth": {@link DemographicsName},
 *       "placeOfBirth": {@link CivicAddress},
 *       "motherNameAtBirth": {@link DemographicsName},,
 *       "motherDateOfBirth": "1930-09-26",
 *       "motherPlaceOfBirth": {@link CivicAddress},,
 *       "dateOfDeath": "1955-04-15"
 *     }
 * </code></pre>
 */
public class Demographics {
  @JsonProperty("dateOfBirth")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date dateOfBirth = null;

  @JsonProperty("gender")
  private GenderEnum gender = null;

  @JsonProperty("genderAtBirth")
  private GenderEnum genderAtBirth = null;

  @JsonProperty("name")
  private DemographicsName name = null;

  @JsonProperty("nameAtBirth")
  private DemographicsName nameAtBirth = null;

  @JsonProperty("placeOfBirth")
  private CivicAddress placeOfBirth = null;

  @JsonProperty("motherNameAtBirth")
  private DemographicsName motherNameAtBirth = null;

  @JsonProperty("motherDateOfBirth")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date motherDateOfBirth = null;

  @JsonProperty("motherPlaceOfBirth")
  private CivicAddress motherPlaceOfBirth = null;

  @JsonProperty("dateOfDeath")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date dateOfDeath = null;

  public Demographics() {
  }

  public Demographics(Date dateOfBirth, GenderEnum gender, GenderEnum genderAtBirth, DemographicsName name, DemographicsName nameAtBirth, CivicAddress placeOfBirth, DemographicsName motherNameAtBirth, Date motherDateOfBirth, CivicAddress motherPlaceOfBirth, Date dateOfDeath) {
    this.dateOfBirth = dateOfBirth;
    this.gender = gender;
    this.genderAtBirth = genderAtBirth;
    this.name = name;
    this.nameAtBirth = nameAtBirth;
    this.placeOfBirth = placeOfBirth;
    this.motherNameAtBirth = motherNameAtBirth;
    this.motherDateOfBirth = motherDateOfBirth;
    this.motherPlaceOfBirth = motherPlaceOfBirth;
    this.dateOfDeath = dateOfDeath;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public GenderEnum getGenderAtBirth() {
    return genderAtBirth;
  }

  public void setGenderAtBirth(GenderEnum genderAtBirth) {
    this.genderAtBirth = genderAtBirth;
  }

  public DemographicsName getName() {
    return name;
  }

  public void setName(DemographicsName name) {
    this.name = name;
  }

  public DemographicsName getNameAtBirth() {
    return nameAtBirth;
  }

  public void setNameAtBirth(DemographicsName nameAtBirth) {
    this.nameAtBirth = nameAtBirth;
  }

  public CivicAddress getPlaceOfBirth() {
    return placeOfBirth;
  }

  public void setPlaceOfBirth(CivicAddress placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
  }

  public DemographicsName getMotherNameAtBirth() {
    return motherNameAtBirth;
  }

  public void setMotherNameAtBirth(DemographicsName motherNameAtBirth) {
    this.motherNameAtBirth = motherNameAtBirth;
  }

  public Date getMotherDateOfBirth() {
    return motherDateOfBirth;
  }

  public void setMotherDateOfBirth(Date motherDateOfBirth) {
    this.motherDateOfBirth = motherDateOfBirth;
  }

  public CivicAddress getMotherPlaceOfBirth() {
    return motherPlaceOfBirth;
  }

  public void setMotherPlaceOfBirth(CivicAddress motherPlaceOfBirth) {
    this.motherPlaceOfBirth = motherPlaceOfBirth;
  }

  public Date getDateOfDeath() {
    return dateOfDeath;
  }

  public void setDateOfDeath(Date dateOfDeath) {
    this.dateOfDeath = dateOfDeath;
  }
}
