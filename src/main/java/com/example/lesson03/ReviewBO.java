package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewBO {
	@Autowired
	private ReviewMapper reviewMapper;
	
	public Review getReview(int id) {
		return reviewMapper.selectReview(id);
	}
	
	// input: Review(단건)
	// output: int(성공한 행의 개수)
	
	public int addReview(Review review) {
		return reviewMapper.insertReview(review);
	}
	
	public int addReviewAsField(int storeId, String menu, String userName ,Double point, String review) {
		// String은 null 가능
		
		
		return reviewMapper.insertReviewAsField(storeId, menu, userName, point, review);
	}
	
}
