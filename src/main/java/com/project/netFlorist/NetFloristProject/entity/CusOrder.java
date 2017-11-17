package com.project.netFlorist.NetFloristProject.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="custOrder")
public class CusOrder implements Serializable{


    

    @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "total_amount")
    private double amount;
    @Column(name = "status", updatable = true)
    private String status;
    @Temporal(TemporalType.DATE)
    @Column(name = "ordered_date")    
    private Date orderedDate;
    //@Temporal(TemporalType.DATE)
    
    
    //@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.LAZY)
   // private List<Product> product =new ArrayList<>();
    
    
    

    public CusOrder(int quantity, double amount, String status, Date orderedDate/*,int customerId*/) {
        this.quantity = quantity;   
        this.amount = amount;
        this.status = status;
        //this.customerId= customerId;
        this.orderedDate = orderedDate;
        
    }

    public CusOrder() {
    }
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
       this.Id = Id;
    }

//    public List<Product> getProduct() {
//        return product;
//    }
//
//    public void setProduct(List<Product> product) {
//        this.product = product;
//    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

//    public int getCustomerId() {
//        return customerId;
//    }
//
//    public void setCustomerId(int customerId) {
//        this.customerId = customerId;
//    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getOrderedDate() {
        return orderedDate;
    }

    public void setOrderedDate(Date orderedDate) {
        
        this.orderedDate = orderedDate;
    }

    
   
}
