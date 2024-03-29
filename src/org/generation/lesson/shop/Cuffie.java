package org.generation.lesson.shop;

import java.math.BigDecimal;

public class Cuffie extends Product{

    private String color;

    private boolean wireless = false;


    public Cuffie(String name, String description, BigDecimal price, BigDecimal vat, Category category,String color, boolean wireless) {
        super(name,description,price,vat,category);
        this.color = color;
        this.wireless = wireless;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    @Override
    public String toString(){
        return "code and name:" +getFullName() + " prezzo con iva: " + getFullPrice() + "€ categoria "+ category.getName() +" descrizione categoria:("+category.getDescription()+") "+"color:"+ getColor()+ " wireless= "+ isWireless();
    }
}
