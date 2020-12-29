package com.aws.techdemo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aws.techdemo.entity.Property;

public interface ProperetyRepository extends JpaRepository<Property, Integer>{
	
	@Query(value= "select count(p) from properties p",  nativeQuery = true )
	int propertiesCount();
}
