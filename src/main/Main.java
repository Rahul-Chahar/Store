/*
 *Author Name: Rahul Chahar
 *IDE: IntelliJ IDEA Community Edition
 *Date: 19/02/2022
 */

package main;

import customer.Customer;
import store.Store;

public class Main
{
    public static void main(String[] args) {
        Store s = new Store();
        Customer c = new Customer("Rahul");
        Customer c1 = new Customer("Pawan");
        Customer c2 = new Customer("Dhirendra");
        Customer c3 = new Customer("Avinash");

        s.register(c);
        s.register(c2);
        s.register(c3);

        s.inviteSale();
    }
}