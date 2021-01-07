package com.aws.techdemo.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aws.techdemo.model.PropertyDetail;
import com.aws.techdemo.model.PropertyDataResponse;
import com.aws.techdemo.service.PropertyService;

import javassist.NotFoundException;

@RestController
@RequestMapping(value = "/tochno/sale")
public class DemoController {

	@Autowired
	private PropertyService propertyService;

	@CrossOrigin
	@GetMapping(value = "/property/list")
	public PropertyDataResponse listProperties(@RequestParam(required = false) String districtName,Pageable pageable) {

		return propertyService.getAllProperties(pageable, districtName);
	}

	 @CrossOrigin
	 @GetMapping(value = "/property/{id}") 
	 public PropertyDetail getpropertyById(@PathVariable  int id) throws NotFoundException{
	  
	 return propertyService.findBypropertyId(id);
	 }

}
