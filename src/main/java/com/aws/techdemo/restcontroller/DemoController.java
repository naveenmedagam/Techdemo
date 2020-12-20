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

import com.aws.techdemo.entity.Product;
import com.aws.techdemo.repository.ProductRepository;

@RestController
@RequestMapping(value = "/api")
public class DemoController {

	@Autowired
	private  ProductRepository productRepository;
	
	@GetMapping(value = "/products")
	public Iterable<Product> getProducts(){
		
		return productRepository.findAll();
	}
	
	@PostMapping(value = "/product", consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public Product createProduct(@RequestBody Product product){
		
		return productRepository.save(product);
	}

	@GetMapping(value = "/products/{id}")
	public Product getProductById(@PathVariable Long id){
		
		return productRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Product not Found"));
	}
	
	
}
