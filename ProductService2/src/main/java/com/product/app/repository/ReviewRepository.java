package com.product.app.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.product.app.model.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, String> {

	List<Review> findByProductId(String productId);

}
