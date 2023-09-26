package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lesson03Ex03RestController {
	@Autowired
	private ReviewBO reviewBO;
	
	// http://localhost/lesson03/ex03?id=5&review=도미노피자는맛있다.
	@RequestMapping("/lesson03/ex03")
	// update
	public String ex03(
			@RequestParam("id") int id,
			@RequestParam("review") String review) {
		
		int rowCount = reviewBO.updateReviewById(id,review);
		return "변경 완료!"+rowCount; // String -> html
		
	}
}
