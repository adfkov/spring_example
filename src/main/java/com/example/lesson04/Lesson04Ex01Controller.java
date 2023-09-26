package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lesson04.bo.UserBo;
import com.example.lesson04.domain.User;

// jsp -> restController가 아니라 controller로 해야된다.

@RequestMapping("/lesson04/ex01")
@Controller
public class Lesson04Ex01Controller {
	@Autowired
	private UserBo userBo;
	
	// 회원가입 페이지
	// http://localhost/lesson04/ex01/sign-up-view
	@RequestMapping(path = "/sign-up-view", method = RequestMethod.GET) // get과 post를 둘 다 허용 / path = 
	public String sign_up_view() {
		return "lesson04/signUp"; // jsp view 경로
	}
	
	// 회원가입 수행(db insert) 후 결과 페이지로 이동
	// http://localhost/lesson04/ex01/sign-up
	@PostMapping(path = "/sign-up") // GetMapping도 있음
	public String signUp(
			@RequestParam("name") String name,
			@RequestParam("yyyymmdd") String yyyymmdd,
			@RequestParam("email") String email,
			@RequestParam(value="introduce", required=false) String introduce
			) {
		// DB Insert 후순위 
		userBo.addUser(name, yyyymmdd, email, introduce);
		
		return "lesson04/signUpResult"; // responsebody가 없기 때문에 가능
		
		
		
	}
	
	// 최신 가입자 한 명 가져오는 페이지
	// http://localhost/lesson04/ex01/get-latest-user-view
	@GetMapping("/get-latest-user-view")
	public String getLatestUserView(Model model) {  // model 바구니에 넣어야 view 가 꺼내감
		// DB select 조회
		User user = userBo.getLatestUser();
		model.addAttribute("result", user);
		model.addAttribute("title", "최신 유저 정보");
		
		// View - Model - Controller
		return "lesson04/get-latest-user"; // 결과 jsp의 경로
	}
	
	

}
