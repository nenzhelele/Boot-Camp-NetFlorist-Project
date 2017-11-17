/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.netFlorist.NetFloristProject.service;

import com.project.netFlorist.NetFloristProject.entity.Bank;
import com.project.netFlorist.NetFloristProject.repository.BankRep;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class BankService {
    
     @Autowired
    private BankRep bankRep;
    
     public Object getAll()
    {
        return bankRep.findAll();
    }
    
      public List<Bank> payment(){
        List<Bank> banks= new ArrayList<>();
          bankRep.findAll().forEach(banks :: add);
             return banks;
    }
}
