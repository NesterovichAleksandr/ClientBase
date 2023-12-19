package com.nesterovich.clientbase.model.repository;

import com.nesterovich.clientbase.model.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
