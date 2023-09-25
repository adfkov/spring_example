package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lesson03Ex02RestController {
	// http://localhost/lesson03/ex02/1
	
	@Autowired
	private ReviewBO reviewBO;

	
	@RequestMapping("/lesson03/ex02/1")
	public String ex02_1() {
		
	
		
		Review review = new Review(); // 일반 자바빈
		review.setStoreId(7);
		review.setMenu("삼겹혼밥세트");
		review.setUserName("사자고양이");
		review.setPoint(4.6);
		review.setReview("혼자 먹기 딱 좋아!");

		
		
		int rowCount = reviewBO.addReview(review);
		
		return "성공된 행의 개수:" +rowCount;
	}
	
	@RequestMapping("/lesson03/ex02/2")
	public String ex02_2() {
		// 컬럼 하나를 파라미터로 해서 따로 보내기
		int rowCount =reviewBO.addReviewAsField(4, "콤비네이션R", "LH차범근8카", 5.0, "간 건강에 딱 좋아!");
		return "성공한 행의 개수:"+rowCount;
		
	}
	
}
