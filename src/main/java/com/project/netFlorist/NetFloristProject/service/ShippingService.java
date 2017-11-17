/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.netFlorist.NetFloristProject.service;

import com.project.netFlorist.NetFloristProject.entity.Shipping;
import com.project.netFlorist.NetFloristProject.repository.ShippingRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author User
 */
@Service
public class ShippingService {
    
    @Autowired
    private ShippingRep shippingRep;
    
    public Shipping save(Shipping shipping){
    return shippingRep.save(shipping);
    
    }
}
