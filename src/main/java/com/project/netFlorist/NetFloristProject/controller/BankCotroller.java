/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.netFlorist.NetFloristProject.controller;

import com.project.netFlorist.NetFloristProject.entity.Bank;
import com.project.netFlorist.NetFloristProject.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
public class BankCotroller {
    
    @Autowired
    private BankService Service;

   @RequestMapping(value="/pay/{cardNo}/{cardHolder}", method = RequestMethod.GET)
    public Bank getAll(@PathVariable int cardNo, @PathVariable String cardHolder)
    {
        return Service.getAll(cardNo,cardHolder);
    }
    
}
