package com.example.lesson05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/lesson05")
@Controller
public class Lesson05Controller {
	@GetMapping("/ex01")
	public String ex01() {
		
		return "lesson05/ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(Model model) {
		// List<String>
		List<String> fruits = List.of("사과", "무화과" , "샤인머스켙", "낑깡", "두리안");
		model.addAttribute("fruits",fruits);
		
		// List<Map<String, Object>>
		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> user = new HashMap<>();
		user.put("name", "정재우");
		user.put("age", "26");
		user.put("hobby", "독서");
		list.add(user);
		
		user = new HashMap<>();
		user.put("name", "최길갈");
		user.put("age", "45");
		user.put("hobby", "왼쪽으로 걷기");
		list.add(user);
		
		model.addAttribute("users", list);
		
		return "lesson05/ex02";
		
	}
	
	
}
