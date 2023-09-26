package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // responsebody 포함
public class Lesson03Ex04RestController {
	@Autowired
	private ReviewBO reviewBO;
	@RequestMapping("/lesson03/ex04")
	// http://localhost/lesson03/ex04?id=22
	public String ex04
	(@RequestParam("id") int id
			) {
		reviewBO.deleteReviewById(id);
		// 에러뜨면 어차피 리턴 안됨
		return "삭제 성공";
	}
}
