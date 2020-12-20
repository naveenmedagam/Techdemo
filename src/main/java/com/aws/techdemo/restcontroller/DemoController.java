package com.aws.techdemo.restcontroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	@GetMapping(value = "/product}")
	public Optional<Product> createProduct(Product product){
		
		return productRepository.create
	}

	@PostMapping(value = "/products")
	public Optional<Product> getProductById(@PathVariable Long id){
		
		return productRepository.findById(id);
	}
	
	
}
