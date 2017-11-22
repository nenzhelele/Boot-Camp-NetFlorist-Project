package com.project.netFlorist.NetFloristProject;

import com.project.netFlorist.NetFloristProject.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestContr {
    
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String Reg() {
        return "registration";
    }
    @RequestMapping( value ="/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
    
    
    //admin
      @RequestMapping(value ="/AdminAddP", method = RequestMethod.GET)
    public String addP() {
        return "AdminAddP";
    }
    
    
    @RequestMapping(value="/saveP", method=RequestMethod.GET)
    public Product creat(@RequestBody Product product){
            return product;
    }
   
    
    @RequestMapping(value="/adminViewP")
    public Object getAll()
    {
        return "adminViewP";
    }
    
    @RequestMapping(value="/home")
    public Object catalog()
    {
        return "home";
    }
         @RequestMapping(value="/customerCart")
    public Object cart()
    {
        return "customerCart";
    }
    
    //delivery 
    @RequestMapping(value="/deliveryInfo")
    public String delivery()
            
    {
    return "deliveryInfo";
    }
    
     @RequestMapping( value ="/payment")
    public String payment() {
        return "payment";
    }
    
      @RequestMapping( value ="/index")
    public String index() {
        return "index";
    }
    
        @RequestMapping( value ="/contactUs")
    public String contactUs() {
        return "contactUs";
    }
    
    @RequestMapping(value="/orderP")
    public String customerOrder(){
    return "orderP";
    }
}
