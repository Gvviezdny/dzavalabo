package com.company;

import device.Device;

public class Car extends Device implements Saleable {
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

        @Override
        public void sale(Human seller, Human buyer, Double price);
        if(buyer.cash) < price){
            System.out.println("KUPUJĄCY MA ZA MAŁO KASY");
        }else if (seller.getCar() =  null) {
            System.out.println("SPRZEDAJĄCY NIE MA ŻADNEGO AUTA");
        }else if (!seller.getCar().equals(this));
            System.out.println("SPRZEDAJĄCY NIE MA TEGO KONKRETNEGO SAMOCHODU (ZŁODZIEJ)");
            else
                seller.cash += price;
            buyer.cash -= price;
            seller.car = null;
            buyer.car = this;
            System.out.println("transackja się udała, kupiono" + this);
        //sprawdzenie czy kupujacy ma hajs
        //sprawdzenie czy sprzedajacy ma samochod
        //itp
    }