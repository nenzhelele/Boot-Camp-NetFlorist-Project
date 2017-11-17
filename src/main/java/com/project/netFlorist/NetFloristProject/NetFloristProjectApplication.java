package com.project.netFlorist.NetFloristProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.project.netFlorist.NetFloristProject","com.project.netFlorist.NetFloristProject.controller","com.project.netFlorist.NetFloristProject.service"})
public class NetFloristProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetFloristProjectApplication.class, args);
	    
	}

}
