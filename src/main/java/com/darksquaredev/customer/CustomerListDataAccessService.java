package com.darksquaredev.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("list")
public class CustomerListDataAccessService implements CustomerDao{

    //db
    private static List<Customer> customers;

    static {
        customers = new ArrayList<>();
        Customer Mihlali = new Customer(

                "Mihlali",
                "mihlali@gmail.com",
                20
        );
        customers.add(Mihlali);

        Customer Siya = new Customer(

                "Siya",
                "siya@gmail.com",
                18
        );
        customers.add(Siya);

    }

    @Override
    public List<Customer> selectAllCustomers() {
        return customers;
    }

    @Override
    public Optional<Customer> selectAllCustomerById(Integer Id) {
        return customers.stream()
                .filter(c -> c.getId().equals(Id))
                .findFirst();

    }

    @Override
    public void insertCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public boolean existsPersonWithEmail(String email) {
        return customers.stream()
                .anyMatch(c-> c.getEmail().equals(email));
    }

    @Override
    public boolean existsPersonWithId(Integer Id) {
        return customers.stream()
                .anyMatch(c -> c.getId().equals(Id));
    }

    @Override
    public void deleteCustomerById(Integer customerId) {
        customers.stream()
                .filter(c -> c.getId().equals(customerId))
                .findFirst()
                .ifPresent(customers::remove);

    }

    @Override
    public void updateCustomer(Customer customer) {
        customers.add(customer);
    }
}
