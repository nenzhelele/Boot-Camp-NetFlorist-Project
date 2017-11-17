/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.netFlorist.NetFloristProject.controller;

import com.project.netFlorist.NetFloristProject.entity.Product;
import com.project.netFlorist.NetFloristProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
/**
 *
 * @author User
 */
@RestController
public class ProductController {
    
    @Autowired
    private ProductService Service;
	
	
  
    @RequestMapping(value="/adminView", method = RequestMethod.GET)
    public List<Product> getAll()
    {
        return Service.getAll();
    }
    
  
    
    @RequestMapping("/AdminAddP")
    public String addP() {
        return "AdminAddP";
    }
    
    @RequestMapping(value="/saveP", method=RequestMethod.POST)
    public Product creat(@RequestBody Product product){
            Service.save(product);
            return product;
    }
    
    @RequestMapping(method = RequestMethod.DELETE,value = "/productdelete/{Id}")
	    public void deleteProduct(@PathVariable int Id)
	    {
	        Service.deletebyId(Id);
	    }
    
    
    
   /* @RequestMapping(value="remove/{Id}")
    @ResponseBody
    public String delete(@PathVariable long Id )
    {
    try{
        
    Product item =Service.findById(Id);
    Service.delete(item);
    }
    catch(Exception ex){
        return"error deleting product"+ ex.toString();           
    }
    return"product successfully deleted";
    }*/
    
    
    
    
   
}
