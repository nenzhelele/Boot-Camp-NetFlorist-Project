/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.netFlorist.NetFloristProject.service;

import com.project.netFlorist.NetFloristProject.entity.Customer;
import com.project.netFlorist.NetFloristProject.repository.CustomerRep;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {
    
    @Autowired
    private CustomerRep customerRep;
    
    private static List<Customer> customers;

    public List<Customer> findAllCustomers()
    {

    	customers = new ArrayList<>();
        
    	customerRep.findAll().forEach(customers::add);
        
       
        return customers; 
    }
    
    public Object getAll()
    {
        return customerRep.findAll();
    }
    
    public Customer save(Customer customer){
        Customer cust = new Customer();
        cust.setCustomerId(customer.getCustomerId());
        cust.setName(customer.getName());
        cust.setEmail(customer.getEmail());
        cust.setPassword(customer.getPassword());
        cust.setSurname(customer.getSurname());
    return customerRep.save(cust);
    }
    
    public void delete(int id){
    customerRep.delete(id);
  
    }
    
  
    
}
