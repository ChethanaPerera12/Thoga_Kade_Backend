package edu.icet.controller;

import edu.icet.model.Customer;
import edu.icet.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/get-all")
    public List<Customer> getAll()
    {return customerService.getAll();}
    @PostMapping("/add-customer")
    public boolean addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }
    @PutMapping("/update-customer")
    public boolean updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }
    @DeleteMapping("/delete-customer-id/{id}")
    public boolean deleteCustomer(@PathVariable String id) {
        return customerService.deleteCustomer(id);
    }
    @GetMapping("/search-customer-id/{id}")
    public Customer searchById(@PathVariable String id) {
        return customerService.searchById(id);
    }

}
