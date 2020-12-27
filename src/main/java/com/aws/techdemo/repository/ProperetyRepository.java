package com.aws.techdemo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.aws.techdemo.entity.Property;

public interface ProperetyRepository extends CrudRepository<Property, Integer>{
	
	
	@Query(value= "select count(p) from properties p",  nativeQuery = true )
	int propertiesCount();
	
     @Query(value="SELECT * FROM properties p offset ?1 limit ?2", nativeQuery = true)
	 public List<Property> findAllProperties(int offset, int limit);
	
	 @Query(value="SELECT * FROM properties", nativeQuery = true)
	 public List<Property> findAllProperties();
	 
	
	

}
