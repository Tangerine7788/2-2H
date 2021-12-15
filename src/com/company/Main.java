package com.company;

public class Main {

    public static void main(String[] args) {
        createCoffee("Cappuccino:").print();
        createCoffee("Americano:").print();
        createCoffee("Latte:").print();

    }
    private static Coffee createCoffee(String caffee ){
        switch (caffee){
            case ("Cappuccino:"):
                return new Cappuccino("Cappuccina:","milk ","espresso +","not water");
            case ("Americano:"):
                return new Americano("Americano:","not milk +","espresso + ","boiling water");
            case ("Latte:"):
                return new Latte("latte:","milk ","15ml espresso + ","not boiling Water");
            default:
                return null;

        }


    }
}
