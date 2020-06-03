package com.company.Composition;

public class Case {
    //instance variables(fields).
    private String model;
    private String manufacturer;
    private String  powerSupply;
    private Dimensions dimensions;//awa compositiona
//Constructor lo intialize krdny fieldakan la jyaty set bakarde datany setish bakarbiny.
    public Case(String model, String manufacturer, Dimensions dimensions,String powerSupply) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.dimensions = dimensions;
        this.powerSupply=powerSupply;
    }
    public void pressPowerButton(){
        System.out.println("power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply(){
        return powerSupply;
    }
    public Dimensions getDimensions() {
        return dimensions;
    }
}
