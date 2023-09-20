package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 // restcontroller = responsebody + controller
@RequestMapping("/lesson01/ex01")
@RestController
public class Lesson01Ex01RestController {
	//String 출력
	// 요청 url : http://localhost:80/lesson01/ex01/3
	@RequestMapping("/3")
	public String ex01_3() {
		return "<h3>@RestController를 사용해 String을 리턴해본다.</h3>";
	}
	
	// Map 을 출력 -> JSON String 출력
	// 요청 URL:  http://localhost:80/lesson01/ex01/4
	@RequestMapping("/4")
	public Map<String, String> ex01_4() {
		Map<String, String> map = new HashMap<>();
		map.put("a","111");
		map.put("b","112");
		map.put("c","113");
		return map;
	}
	
	// 내가 만든 클래스 객체 리턴
	
	// 요청 URL:  http://localhost:80/lesson01/ex01/5
	@RequestMapping("/5")
	public Data ex01_5() { 
		Data data = new Data(); // 일반 자바 bean(객체)
		data.setId(1);
		data.setName("정재우");
		return data; // 일반 자바 빈 객체도 json으로 내려간다.
		
	}
	// 요청 URL:  http://localhost:80/lesson01/ex01/6
	@RequestMapping("/6")
	public ResponseEntity<Data> ex01_6() {
		Data data = new Data(); // 일반 자바 bean(객체)
		data.setId(1);
		data.setName("정재우");
		
		return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR); // HTTP STATUS 검색  200 ok 500 error 
		// String 리턴 : HTML
		// 객체 리턴( 내가 만든 객체, map , list) : JSON
		
	}

}
