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
import com.aws.techdemo.repository.ProperetyRepository;

@RestController
@RequestMapping(value = "/api")
public class DemoController {

	@Autowired
	private ProperetyRepository propertyRepository;

	@GetMapping(value = "/properties")
	public Iterable<Property> getProducts() {

		return propertyRepository.findAll();
	}

	 @GetMapping(value = "/property/{id}") 
	 public Property getProductById(@PathVariable  int id){
	  
	 return propertyRepository.findById(id).orElseThrow(()-> new
	 ResponseStatusException(HttpStatus.NOT_FOUND,"Product not Found"));
	 }

}
