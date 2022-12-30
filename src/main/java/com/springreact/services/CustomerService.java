package com.springreact.services;

import com.springreact.entities.Customer;
import com.springreact.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public List<Customer> getCustomers() {
        return customerRepo.findAll();
    }

    public Optional<Customer> getCustomer(int id) {
        return customerRepo.findById(id);
    }
    public Customer addCustomer(Customer customer) {
        customerRepo.save(customer);
        return customer;
    }

    public Customer deleteCustomer(Customer customer) {
        customerRepo.save(customer);
        return customer;
    }

}
