package com.aws.techdemo.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aws.techdemo.entity.Property;

public interface ProperetyRepository extends JpaRepository<Property, Integer>{
	
	@Query(value= "select count(p) from properties p",  nativeQuery = true )
	int propertiesCount();
	
	@Query(value= "select count(*) from properties p inner join districts d  on p.district_id=d.district_id where  d.district_name_bg =:districtName",  nativeQuery = true )
	int propertiesCountbyDistrictName(String districtName);
	
	@Query(value= "select * from properties p inner join districts d  on p.district_id=d.district_id where  d.district_name_bg =:districtName",  nativeQuery = true )
	Page<Property> findPropertiesByDistrictName(String districtName, Pageable pageable);
}
