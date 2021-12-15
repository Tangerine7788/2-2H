package com.company;

public class Latte extends Coffee implements Printable{

    public Latte(String name, String milk, String espresso, String boilingWater) {
        super(name, milk, espresso, boilingWater);
    }

    @Override
    public void print() {
        System.out.println(getName()+" "+ getEspresso()+" "+getMilk()+" ");
    }
}
