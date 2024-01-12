package com.examples.cucumber;

public class Toppings {
    private String name;
    private BubbleTea bt;

    public Toppings(String name, BubbleTea bt)
    {
        // initialisation des variables d'instance
        this.name = name;
        this.bt = bt;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public BubbleTea getBt(){
        return bt;
    }

    public void setBt(BubbleTea bt){
        this.bt = bt;
    }

    public String verifyContain(String name){
        if(bt.getName().equals(name)){
            return "Yes !";
        }
        return "No...";
    }
}
