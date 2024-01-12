package com.examples.cucumber;

public class BubbleTea {
    private String name;
    private double price;

    public BubbleTea(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void promotion(double changement){
        price += changement;
    }


}
