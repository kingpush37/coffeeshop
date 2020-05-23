package com.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class CoffeeServer {
    private List<WaitingCustomers> customersList = new ArrayList<>();
    private String completedDrink;

    void takeOrder(WaitingCustomers customer) {
        this.customersList.add(customer);
    }

    void prepareDrink(String drinkToPrepare) {

    }


    void callOutCompletedOrder() {
        for (WaitingCustomers customers: customersList)
            customers.orderReady();
    }
}
