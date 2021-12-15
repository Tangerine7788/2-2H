package com.company;

public class Americano extends Coffee implements Printable{


    public Americano(String name, String milk, String espresso, String boilingWater) {
        super(name, milk, espresso, boilingWater);
    }

    @Override
    public void print() {
        System.out.println(getName()+" "+getEspresso()+" "+getBoilingWater()+" " );
    }
}
