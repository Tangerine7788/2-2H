package com.company;

public abstract class Coffee implements Printable {
    private String name;
    private String milk;
    private String espresso;
    private String boilingWater;

    public Coffee(String name, String milk, String espresso, String boilingWater) {
        this.name = name;
        this.milk = milk;
        this.espresso = espresso;
        this.boilingWater = boilingWater;
    }

    public String getName() {
        return name;
    }

    public String getMilk() {
        return milk;
    }

    public String getEspresso() {
        return espresso;
    }

    public String getBoilingWater() {
        return boilingWater;
    }
}
