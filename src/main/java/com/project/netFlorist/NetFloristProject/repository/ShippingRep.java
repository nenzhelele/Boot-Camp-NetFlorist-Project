/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.netFlorist.NetFloristProject.repository;

import com.project.netFlorist.NetFloristProject.entity.Shipping;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository
public interface ShippingRep extends CrudRepository<Shipping,Integer>{
    
     //public Product findAllByname(String lname);
    
}

