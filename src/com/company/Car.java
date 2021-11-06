package com.company;

import device.Device;

public class Car extends Device {
    public String producer;
    public String model;
    public Double millage;
    public Double engineSize;
    public Double value;
    public String plates;
    Integer yearOfProduction;
    String color;


    public Car(String producer, String model, Integer yearOfProduction, String producer1) {
        super(producer, model, yearOfProduction);
        this.producer = producer1;
    }
}
