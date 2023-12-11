package org.generation.lesson.shop;

public class Category {
    // ATTRIBUTI
    public String name;
    public String description;

    // COSTRUTTORI

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // GETTER E SETTER

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // METODI
}
