package com.app.service;

import com.app.dto.ProductDto;

public interface ProductService {
	String createProduct(ProductDto product) ;
	ProductDto getProductByCode(String productCode) ;
}
