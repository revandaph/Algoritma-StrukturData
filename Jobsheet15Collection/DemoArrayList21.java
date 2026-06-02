package Jobsheet15Collection;

import java.util.ArrayList;

public class DemoArrayList21 {

    public static void main(String[] args) {

        ArrayList<Customer21> customers = new ArrayList<>();

        Customer21 customer1 = new Customer21(1, "Zakia");
        Customer21 customer2 = new Customer21(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer21(4, "Cica"));

        customers.add(2, new Customer21(100, "Rosa"));

        System.out.println(customers.indexOf(customer2));

        Customer21 customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        for (Customer21 cust : customers) {
            System.out.println(cust.toString());
        }

        ArrayList<Customer21> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer21(201, "Della"));
        newCustomers.add(new Customer21(202, "Victor"));
        newCustomers.add(new Customer21(203, "Sarah"));

        customers.addAll(newCustomers);

        for (Customer21 cust : customers) {
            System.out.println(cust.toString());
        }

        System.out.println(customers);
    }
}