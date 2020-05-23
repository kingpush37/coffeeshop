package com.observerpattern;

public class Main {

    public static void main(String[] args) {
    CoffeeServer jane = new CoffeeServer();
	Customer c1 = new Customer("jason", "green tea");
	Customer c2 = new Customer("trell", "ginger raspberry tea");

	jane.takeOrder(c1);
	jane.takeOrder(c2);
	jane.callOutCompletedOrder();
    }
}
