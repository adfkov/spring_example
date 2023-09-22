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
}
