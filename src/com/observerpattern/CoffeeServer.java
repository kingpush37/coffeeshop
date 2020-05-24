package com.observerpattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoffeeServer {
    private List<WaitingCustomers> customersList = new ArrayList<>();
    //private String completedDrink;

    void takeOrder(WaitingCustomers customer) {
        this.customersList.add(customer);
    }

    void prepareDrink(String drinkToPrepare) {
        //TODO
    }


    void callOutCompletedOrder(WaitingCustomers customer) {
        for (WaitingCustomers customers: customersList) {
            if (customers.equals(customer))
            customer.orderReady();
        }
        customersList.remove(customer);
    }


}
