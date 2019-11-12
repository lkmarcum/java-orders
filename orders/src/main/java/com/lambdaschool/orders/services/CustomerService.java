package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Customer;

import java.util.List;

public interface CustomerService
{
    List<Customer> findAll();

    Customer findCustomerByName(String name);

    Customer save(Customer customer);

    Customer update(Customer customer, long custcode);

    void delete(long custcode);
}
