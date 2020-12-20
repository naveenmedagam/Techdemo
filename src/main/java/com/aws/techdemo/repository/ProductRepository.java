package com.aws.techdemo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aws.techdemo.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
	
//	List<Product> findByName(String productName);
	
	

}
