/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.netFlorist.NetFloristProject.controller;

import com.project.netFlorist.NetFloristProject.entity.Customer;
import com.project.netFlorist.NetFloristProject.service.CustomerService;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
public class CustomerController {
    @Autowired
    private CustomerService service;
   
    private List<Customer> customers;

    @RequestMapping(method = RequestMethod.GET, value = "/customers")
    public List<Customer> getAll()
    {
    	customers = new ArrayList<>();
        service.findAllCustomers().forEach(customers::add);
        return customers;
    }
    
	@RequestMapping("/")
    public String Home() {
        return "home";
    }
    
    @RequestMapping("/registration")
    public String Reg() {
        return "registration";
    }
    
    @RequestMapping( "/login")
    public String login() {
        return "login";
    }
   
    
   
    
    @RequestMapping(method = RequestMethod.POST, value = "/resting")
    public Customer create(@RequestBody Customer customer){
        service.save(customer);
        return customer;
    }
    

    
    
    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value ="/adminViewP/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable int id ){ 
    try
         {
            //customer user =service.findById(id)
               service.delete(id);
        }
               catch(Exception ex){
        return "error deleting the user:"+ ex.toString();
          
        }
        return "deleting succefully";
    
    }
    
    @RequestMapping(value ="/update/{id}")
    @ResponseBody
    public String update(@RequestBody Customer customer,@PathVariable int id){
    
        try{
         
            service.save(customer);
        
        }catch(Exception ex){
                
                return "error updating " + ex.toString();
                }
             return "succefully update ";
        }
    
    }
    
    
    

