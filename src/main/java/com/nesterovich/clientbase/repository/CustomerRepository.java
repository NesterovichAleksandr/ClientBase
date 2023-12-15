package com.nesterovich.clientbase.repository;

import com.nesterovich.clientbase.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
