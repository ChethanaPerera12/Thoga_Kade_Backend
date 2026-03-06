package edu.icet.repository;

import edu.icet.model.Customer;
import edu.icet.model.Item;

import java.util.List;

public interface CustomerRepository {
    List<Customer> getAll();
    boolean addCustomer(Customer customer);
    boolean updateCustomer(Customer customer);
    boolean deleteCustomer(String id);
    Customer serchById(String id);
}
