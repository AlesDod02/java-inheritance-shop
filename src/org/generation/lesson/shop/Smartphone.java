package org.generation.lesson.shop;

import java.math.BigDecimal;

public class Smartphone  extends Product{

    private int imei;

    private  String memory;

    public Smartphone(String name, String description, BigDecimal price, BigDecimal vat, Category category,int imei, String memory) {
        super(name,description,price,vat,category);
        this.imei = imei;
        this.memory = memory;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }



    @Override
    public String toString(){
        return "code and name:" +getFullName() + " prezzo con iva: " + getFullPrice() + "€ categoria :"+ category.getName() +" descrizione categoria:("+category.getDescription()+") "+"imei:"+ getImei()+ " memoria : "+ getMemory();
    }
}

