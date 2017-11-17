/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.netFlorist.NetFloristProject.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name="product")
public class Product implements Serializable{

        @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="Id")
    private int Id;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="price")
    private Float price;
    @Column(name = "image",length=1000000)
    private String image;
    
    /**
     * @return the image
     */
    public String getimage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setimage(String image) {
        this.image = image;
    }

       

    
    
    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the name
     */
    public String getname() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setname(String name) {
        this.name = name;
    }

    /**
     * @return the PDescription
     */
    public String getdescription() {
        return description;
    }

    /**
     * @param description the PDescription to set
     */
    public void setdescription(String description) {
        this.description = description;
    }

    /**
     * @return the Price
     */
    public Float getprice() {
        return price;
    }

    /**
     * @param price the Price to set
     */
    public void setprice(Float price) {
        this.price = price;
    }
    
 
}
