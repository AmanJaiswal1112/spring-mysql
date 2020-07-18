package com.prac.springboot.mysql.api.Repository;

import com.prac.springboot.mysql.api.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer>
{
}
