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

        public boolean equals (Car Car){
            if (this == car) {
                return true;
            } else if (this.producer.equals(car.producer)
                    && this.model.equals(car.model)
                    && this.millage.equals(car.millage)
                    && this.plates.equals(car.plates)) {
                return true;
            } else {
                return false;
            }
        }
        public void turnOn() {
            System.out.println("przekręcam kluczyk");
        }

    }