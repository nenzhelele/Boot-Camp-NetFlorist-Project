/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.netFlorist.NetFloristProject.controller;

import com.project.netFlorist.NetFloristProject.service.BankService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
public class Bank {
    
    @Autowired
    private BankService Service;
    
   public List<Bank> banks;

   @RequestMapping(value="/pay", method = RequestMethod.GET)
    public Object getAll()
    {
        return Service.getAll();
    }
    
}
