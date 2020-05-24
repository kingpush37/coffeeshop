package com.observerpattern;

import com.observerpattern.customer.Customer;

public class Main {

    public static void main(String[] args) {
        Customer firstCustomer = new Customer("jason", "ginger tea");
        Customer secondCustomer = new Customer("trell", "cappuccino");
        Customer thirdCustomer = new Customer("amy", "medium coffee");
        Customer fourthCustomer = new Customer("king", "house special coffee");
        Customer fifthCustomer = new Customer("mike", "black tea");

        CoffeeServer jane = new CoffeeServer();
        jane.takeOrder(firstCustomer);
        jane.takeOrder(secondCustomer);
        jane.takeOrder(thirdCustomer);
        jane.takeOrder(fourthCustomer);
        jane.takeOrder(fifthCustomer);

        jane.callOutCompletedOrder(secondCustomer);
        jane.callOutCompletedOrder(firstCustomer);
        jane.callOutCompletedOrder(fifthCustomer);





    }
}
