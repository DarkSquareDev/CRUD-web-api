package com.darksquaredev.customer;



import java.util.List;
import java.util.Optional;

public interface CustomerDao {
    List<Customer> selectAllCustomers();
    Optional<Customer> selectAllCustomerById(Integer Id);
    void insertCustomer(Customer customer);
    boolean existsPersonWithEmail(String email);
    boolean existsPersonWithId(Integer Id);
    void deleteCustomerById(Integer customerId);
    void updateCustomer(Customer update);

}
