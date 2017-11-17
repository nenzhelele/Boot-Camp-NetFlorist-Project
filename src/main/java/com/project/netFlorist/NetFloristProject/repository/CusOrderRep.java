package com.project.netFlorist.NetFloristProject.repository;

import com.project.netFlorist.NetFloristProject.entity.CusOrder;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface CusOrderRep extends CrudRepository<CusOrder, Integer> {
	// public List<CusOrder> findById(Integer Id);
	 
}
