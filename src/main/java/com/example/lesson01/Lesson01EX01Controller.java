package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Spring 객체임을 등록, Spring bean 등록


//request mapping 분리
@RequestMapping("/lesson01/ex01") // 먼저 읽힌다.
public class Lesson01EX01Controller { // spring container 

	// 요청 URL: http://localhost:80/lesson01/ex01/1
	@ResponseBody // 리턴되는 문자열을 response body 에 담아 보낸다.
	@RequestMapping("/1") // 주소 매핑
	public String ex01_1() {
		String text = "<h1>문자열을 response body로 보내는 예제</h1>";
		return text;
	}
	
	// 요청 URL: http://localhost:80/lesson01/ex01/2
	@RequestMapping("/2") // 주소 매핑
	
	public @ResponseBody Map<String, Object> ex01_2() { // 리턴되는 String이 응답의 바디에 담겨 내려간다.
		Map<String, Object> map = new HashMap<>();
		map.put("apple", 4);
		map.put("banana", 10);
		map.put("orange", 125);
		map.put("grape", 67);
		
		// map을 리턴하면 JSON으로 변경되어 출력된다.
		// web starter 에 
		return map;
		
	}

}

// request는 엔터를 누르는 순간 발생, spring container 라는 곳에 bean들이 들어있다.
// controller에 처음 request 가 들어온다. 이름이 같은 메소드를 찾는다.

