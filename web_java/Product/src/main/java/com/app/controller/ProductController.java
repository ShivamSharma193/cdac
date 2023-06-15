package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiResponse;
import com.app.dto.ProductDto;
import com.app.service.ProductService;


@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductService productService ;
	
	// Create product. Appropriate validations added in dto and entity
	@PostMapping
	public ResponseEntity<?> createProduct(@RequestBody ProductDto product){
		try {
			System.out.println("In create product" + product);
			return new ResponseEntity<>(productService.createProduct(product), HttpStatus.CREATED) ;
		}catch(RuntimeException e) {
			return new ResponseEntity<>( new ApiResponse(e.getMessage()),HttpStatus.CONFLICT)   ;
		}	
	}
	
	// Get product by product code
	@GetMapping("/{productCode}")
	public ResponseEntity<?> getProductByCode(@PathVariable String productCode) {
		try {
			System.out.println("in get product by code"+ productCode);
			
			return new ResponseEntity<>(productService.getProductByCode(productCode), HttpStatus.OK);
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse(e.getMessage()));
		}

	}
	
}
