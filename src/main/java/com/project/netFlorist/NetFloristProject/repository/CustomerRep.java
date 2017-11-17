package com.project.netFlorist.NetFloristProject.repository;

import com.project.netFlorist.NetFloristProject.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRep extends CrudRepository<Customer, Integer>{


}
