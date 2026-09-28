package org.uob.a1;

public class Item {
    private String description;
    private String name;

    public Item(String description, String name) {
        this.description = description;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}