package com.prac.springboot.mysql.api.controller;

import com.prac.springboot.mysql.api.Repository.CustomerRepository;
import com.prac.springboot.mysql.api.Repository.ProductRepository;
import com.prac.springboot.mysql.api.dao.OrderRequest;
import com.prac.springboot.mysql.api.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController
{
    @Autowired
    CustomerRepository customerRepository;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest orderRequest)
    {
        return customerRepository.save(orderRequest.getCustomer());
    }

    @GetMapping("/getAllOrder")
    public List<Customer> getAllOrder()
    {
        return (List<Customer>) customerRepository.findAll();
    }
}
