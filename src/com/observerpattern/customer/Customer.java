package com.observerpattern.customer;

import com.observerpattern.WaitingCustomers;

public class Customer implements WaitingCustomers {
    private String name;
    private String drinkOrdered;

    public Customer(String name, String drinkOrdered) {
        this.name = name;
        this.drinkOrdered = drinkOrdered;
    }




    @Override
    public void orderReady() {
        System.out.println(name + " your " + drinkOrdered + " is ready!");
    }


}
