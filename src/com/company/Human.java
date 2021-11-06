package com.company;

public class Human extends Animal {
    String firstName;
    String lastName;
    Integer age;
    Double salary;
    Animal pet;
    Car car;
    Public Double cash;

    Human() {
        this.salary = 1200.0;
    }
    void setSalary(Double salary) {
    if (salary > 0) {
        System.out.println("dane wysyłane systemu księgowego");
        System.out.println("odbierz aneks od pani Hani");
        System.out.println("ZUS I US JUŻ WIEDZĄ O PIENIĄDZACH");
        this.salary = salary;
        System.out.println("nowe wynagrodzenie: " + this);
        else
           System.out.println("chyba Cię Bóg opuścił");
    }
}