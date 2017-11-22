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
    @Column(name = "amount")
    private double amount;
    @Column(name = "status", updatable = true)
    private String status;
    @Temporal(TemporalType.DATE)
    @Column(name = "date")    
    private Date date = new Date();
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="price")
    private Float price;
    @Column(name = "image",length=1000000)
    private String image;
    @Column(name="orderno")
    private int orderno;

    public CusOrder(int Id, int quantity, double amount, String status, Date date, String name, String description, Float price, String image, int orderNo) {
        this.Id = Id;
        this.quantity = Id;
        this.amount = amount;
        this.status = status;
        this.date = date;
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.orderno = orderNo;
    }

    public CusOrder() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getOrderedDate() {
        return date;
    }

    public void setOrderedDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getOrderno() {
        return orderno;
    }

    public void setOrderno(int orderno) {
        this.orderno = orderno;
    }

}
