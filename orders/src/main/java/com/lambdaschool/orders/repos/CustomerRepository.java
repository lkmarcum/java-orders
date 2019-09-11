package com.lambdaschool.orders.repos;

import com.lambdaschool.orders.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>
{
}
