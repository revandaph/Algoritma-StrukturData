package Jobsheet15Collection;

import java.util.ArrayList;

public class DemoArrayList21 {

    public static void main(String[] args) {

        ArrayList<Customer21> customers = new ArrayList<>(2);

        Customer21 customer1 = new Customer21(1, "Zakia");
        Customer21 customer2 = new Customer21(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        for (Customer21 cust : customers) {
            System.out.println(cust.toString());
        }
    }
}