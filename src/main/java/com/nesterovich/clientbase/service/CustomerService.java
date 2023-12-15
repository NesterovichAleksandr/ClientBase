package com.nesterovich.clientbase.service;

import com.nesterovich.clientbase.model.Customer;
import com.nesterovich.clientbase.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllEntities() {
        return (List<Customer>) customerRepository.findAll();
    }
}
