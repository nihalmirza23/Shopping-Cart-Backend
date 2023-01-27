package com.product.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.product.app.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

	List<Product> findByCategory(String category);

	Product findByProductName(String productName);

	List<Product> findByProductType(String producttype);

	List<Product> findByMerchantId(String merchantId);

	List<Product> findByCategoryId(String categoryId);

	
	
	

}
