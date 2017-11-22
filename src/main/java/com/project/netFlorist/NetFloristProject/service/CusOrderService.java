/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.netFlorist.NetFloristProject.service;

import com.project.netFlorist.NetFloristProject.entity.CusOrder;
import com.project.netFlorist.NetFloristProject.repository.CusOrderRep;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *+
 * @author User
 */
@Service
public class CusOrderService {
 
    @Autowired
    private CusOrderRep cusorderRep;
    
    public CusOrder findUserOrderById(Integer Id)
    {
        return cusorderRep.findOne(Id);
    }
    public CusOrder saveOrder(CusOrder  userOrders) {

  return cusorderRep.save(userOrders);
   }
    
    public Object findAll(){
    
        return cusorderRep.findAll();
    }
}
