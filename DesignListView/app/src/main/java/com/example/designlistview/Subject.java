package com.example.designlistview;

public class Subject {
    private String name;
    private String description;
    private int sourceOfPicture;

    public Subject() {
    }

    public Subject(String name, String description, int sourceOfPicture) {
        this.name = name;
        this.description = description;
        this.sourceOfPicture = sourceOfPicture;
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

    public int getSourceOfPicture() {
        return sourceOfPicture;
    }

    public void setSourceOfPicture(int sourceOfPicture) {
        this.sourceOfPicture = sourceOfPicture;
    }
}
