package com.observerpattern;

public class Customer implements WaitingCustomers {
    public String name;
    public String drinkOrdered;

    public Customer(String name, String drinkOrdered) {
        this.name = name;
        this.drinkOrdered = drinkOrdered;
    }


    @Override
    public void orderReady() {
        System.out.println(name + " your " + drinkOrdered + " is ready.");
    }
}
