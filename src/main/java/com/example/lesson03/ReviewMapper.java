package com.example.lesson03;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewMapper {
	public Review selectReview(int id);
	
	
	public int insertReview(Review review);
	
	public int insertReviewAsField(
			// 파라미터 2개 이상이면 map으로 만든다(@Param)
			@Param("storeId")int storeId, 
			@Param("menu")String menu, 
			@Param("userName")String userName,
			@Param("point")Double point, 
			@Param("review")String review);
		// String은 null 가능
	
}