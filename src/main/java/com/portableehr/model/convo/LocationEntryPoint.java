package com.portableehr.model.convo;

import java.util.UUID;

public class LocationEntryPoint {
    private UUID id;
    private String name;
    private String description;
    private char[] icon;

    public LocationEntryPoint() {
    }

    public LocationEntryPoint(UUID id, String name, String description, char[] icon) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.icon = icon;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char[] getIcon() {
        return icon;
    }

    public void setIcon(char[] icon) {
        this.icon = icon;
    }
}