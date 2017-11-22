/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.netFlorist.NetFloristProject.service;

import com.project.netFlorist.NetFloristProject.entity.Product;
import com.project.netFlorist.NetFloristProject.repository.ProductRep;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class ProductService {

    @Autowired
    private ProductRep productRep;
    
   

  
    public Product save(Product product){
        return productRep.save(product);
    }
    
    public List<Product> getAll(){
     List<Product> products = new ArrayList<>();
productRep.findAll().forEach(products :: add);
        return products;
    }
    
    public void delete(int Id)
    {
       productRep.delete(Id);
    
    }

 public List<Product> catalog(){
		 List<Product> products = new ArrayList<>();
		 productRep.findAll().forEach(products :: add);
        return products;
    }

    public void deletebyId(int Id) {
        productRep.delete(Id);
    }
    ////////////////////////update////////////////////////////////////////////
//     public int updated(int Id, String name, String description , float price)
//    {
//        
//        return productRep.updateItems(Id, name, description, price);
//    }
 
 
    
}
