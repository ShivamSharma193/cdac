package com.app.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.ProductDto;
import com.app.entities.Product;
import com.app.exec.InvalidProductDetailsException;
import com.app.exec.ResourceNotFoundException;
import com.app.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepo;

	@Autowired
	private ModelMapper mapper;

	@Override
	public String createProduct(ProductDto product) {
		try {
		Product persistentProduct = productRepo.save(mapper.map(product, Product.class));
		return persistentProduct.getProductCode() + " " + persistentProduct.getName() + " product added.";
		}catch (Exception e) {
			throw new InvalidProductDetailsException("Invalid product details.")  ;
		}
		}

	@Override
	public ProductDto getProductByCode(String productCode) {
		Product product = productRepo.findByProductCode(productCode)
				.orElseThrow(() -> new ResourceNotFoundException("No product with code " + productCode));

		return mapper.map(product, ProductDto.class);
	}

}
