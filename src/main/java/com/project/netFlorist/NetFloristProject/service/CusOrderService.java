/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.netFlorist.NetFloristProject.service;

import com.project.netFlorist.NetFloristProject.entity.CusOrder;
import com.project.netFlorist.NetFloristProject.repository.CusOrderRep;


import com.project.netFlorist.NetFloristProject.entity.Product;

import java.util.ArrayList;
import java.util.List;

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
    	CusOrder toOrder = new CusOrder();
        List<Product> products = new ArrayList<Product>();
        toOrder.setId(userOrders.getId());
        toOrder.setAmount(userOrders.getAmount());  
        
//        for(int x =0 ; x < userOrders.getProduct().size() ;x++)
//        {
//                int Id = userOrders.getProduct().get(x).getId();
//           Product product = (Product) cusorderRep.findByCustomerId(Id);
//           products.add(product);
//        }
//        toOrder.setProduct(products);
        toOrder.setStatus(userOrders.getStatus());
        toOrder.setQuantity(userOrders.getQuantity());
        toOrder.setOrderedDate(userOrders.getOrderedDate());
  return cusorderRep.save(toOrder);
   }
}
