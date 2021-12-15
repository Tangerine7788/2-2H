package com.company;

public class Cappuccino extends Coffee implements Printable{

    public Cappuccino(String name, String milk, String espresso, String boilingWater) {
        super(name, milk, espresso, boilingWater);
    }

    @Override
    public void print() {
        System.out.println(getName()+ "  " +getEspresso()+ " " + getMilk()+" ");

    }
}

