package com.portableehr.model.server;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.UUID;

/**
 * Same as {@link Contact} but without a "type"
 */
public class EmergencyContact extends Contact {

    @JsonIgnore
    private ContactTypeEnum type = null;

    public EmergencyContact() {
    }

    public EmergencyContact(Contact contact){
        this(
                contact.getFeedItemId(),
                contact.getBackendItemId(),
                contact.getLastName(),
                contact.getFirstName(),
                contact.getMiddleName(),
                contact.getPreferredGender(),
                contact.getPreferredLanguage(),
                contact.getEmail(),
                contact.getAlternateEmail(),
                contact.getMobilePhone(),
                contact.getLandPhone(),
                contact.getFax(),
                contact.getProfessionalSalutation(),
                contact.getSalutation(),
                contact.getTitles()
        );
    }

    public EmergencyContact(UUID feedItemId, UUID backendItemId, String lastName, String firstName, String middleName, GenderEnum preferredGender,
                            PreferredLanguageEnum preferredLanguage, String email, String alternateEmail, String mobilePhone, String landPhone, String fax,
                            String professionalSalutation, String salutation, String titles) {
        super(feedItemId, backendItemId, null, lastName, firstName, middleName, preferredGender, preferredLanguage, email, alternateEmail, mobilePhone, landPhone, fax,
                professionalSalutation, salutation, titles);
    }

    public ContactTypeEnum getType() {
        return type;
    }

    public void setType(ContactTypeEnum type) {
        this.type = type;
    }
}
