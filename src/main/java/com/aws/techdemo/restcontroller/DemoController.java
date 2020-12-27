package com.aws.techdemo.restcontroller;

import java.awt.PageAttributes.MediaType;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.aws.techdemo.entity.Property;
import com.aws.techdemo.model.PropertyData;
import com.aws.techdemo.model.PropertyDataResponse;
import com.aws.techdemo.repository.ProperetyRepository;
import com.aws.techdemo.service.PropertyService;

@RestController
@RequestMapping(value = "/api")
public class DemoController {

	@Autowired
	private PropertyService propertyService;

	@GetMapping(value = "/properties/{offset}/{limit}")
	public PropertyDataResponse getProducts(@PathVariable int offset,@PathVariable int limit ) {

		return propertyService.getAllProperties(offset,limit);
	}

	 @GetMapping(value = "/property/{id}") 
	 public PropertyData getProductById(@PathVariable  int id){
	  
	 return propertyService.findByProductId(id);
	 }

}
