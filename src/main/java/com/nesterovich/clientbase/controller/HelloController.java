package com.nesterovich.clientbase.controller;

import com.nesterovich.clientbase.model.entity.Customer;
import com.nesterovich.clientbase.model.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HelloController {

    private final CustomerService customerService;

    @Autowired
    public HelloController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/hello")
    public String hello(Model model) {
        List<Customer> entities = customerService.getAllEntities();
        model.addAttribute("entities", entities);
        return "hello";
    }
}
