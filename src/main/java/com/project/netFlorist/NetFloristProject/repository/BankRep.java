/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.netFlorist.NetFloristProject.repository;

import com.project.netFlorist.NetFloristProject.entity.Bank;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository
public interface BankRep extends CrudRepository<Bank, Integer>{

   @Query("SELECT b FROM Bank b WHERE b.cardNo = :cardNo AND b.cardHolder =:cardHolder")
   public Bank viewBankDetails(@Param(value = "cardNo") int cardNo, @Param(value = "cardHolder") String cardHolder);
 
}
