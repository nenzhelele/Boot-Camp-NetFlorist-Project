/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.netFlorist.NetFloristProject.controller;

import com.project.netFlorist.NetFloristProject.entity.Shipping;
import com.project.netFlorist.NetFloristProject.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */

@RestController
public class ShippingController {
    
    
    
    @Autowired
    private ShippingService service;
    
    @RequestMapping(value="/ship", method =RequestMethod.POST)
    public Shipping add(@RequestBody Shipping shipping){
     Shipping ship = service.save(shipping);
     if(ship != null)
     {
         System.out.println("Shipped");
     }
    return ship;
    }
    
 
}
