package com.example.lesson02;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson02.domain.UsedGoods;

@RestController // controller + responsebody
public class Lesson02Ex01RestController {
	@RequestMapping("/")
	// 요청 url : http://localhost:80/lesson02/ex01
	public List<UsedGoods> ex01() {
		List<UsedGoods> usedGoodsList = ;
		return usedGoodsList; // json으로 출력
	}
}
