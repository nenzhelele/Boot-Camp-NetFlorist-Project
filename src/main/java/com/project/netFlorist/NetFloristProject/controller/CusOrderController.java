/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.netFlorist.NetFloristProject.controller;

import com.project.netFlorist.NetFloristProject.entity.CusOrder;
import com.project.netFlorist.NetFloristProject.service.CusOrderService;
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
public class CusOrderController {
    
  @Autowired
    private CusOrderService service;
    
    @RequestMapping(value="/Custorder", method =RequestMethod.POST)
    public CusOrder add(@RequestBody CusOrder cusorder){
     CusOrder cusorde = service.saveOrder(cusorder);
     if(cusorde != null)
     {
         System.out.println("odered");
     }
    return cusorder;
    }
    
    
}
