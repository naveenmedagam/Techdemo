package com.aws.techdemo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aws.techdemo.entity.Property;

public interface ProperetyRepository extends CrudRepository<Property, Integer>{
	
	//List<Product> findByName(String productName);
	
	

}
