package org.generation.lesson.shop;

import java.math.BigDecimal;

public class Televisore extends Product{

private int dimension;

private boolean smart=false;

    public Televisore(String name, String description, BigDecimal price, BigDecimal vat, Category category,int dimension, boolean smart) {
        super(name,description,price,vat,category);
        this.dimension = dimension;
        this.smart = smart;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
}
