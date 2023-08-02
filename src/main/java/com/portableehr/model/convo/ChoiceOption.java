package com.portableehr.model.convo;

import java.util.UUID;

public class ChoiceOption {
    private UUID id;
    private Boolean disablesReminder;
    private String label;

    public ChoiceOption() {
    }

    public ChoiceOption(UUID id, Boolean disablesReminder, String label) {
        this.id = id;
        this.disablesReminder = disablesReminder;
        this.label = label;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Boolean getDisablesReminder() {
        return disablesReminder;
    }

    public void setDisablesReminder(Boolean disablesReminder) {
        this.disablesReminder = disablesReminder;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
