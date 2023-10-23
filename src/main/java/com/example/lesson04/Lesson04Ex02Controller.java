package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.lesson04.bo.StudentBO;
import com.example.lesson04.domain.Student;

@RequestMapping("/lesson04/ex02")
@Controller
public class Lesson04Ex02Controller {
@Autowired
private StudentBO studentBO;
	// http://localhost/lesson04/ex02/add-student-view
	// 학생정보 추가 화면
	@GetMapping("/add-student-view")// 브라우저에 치자마자 getMap
	public String addStudentView() {
		return "lesson04/addStudent";
	}
	
	// http://localhost/lesson04/ex02/add-student
	@PostMapping("/add-student")
	public String addStudent(
			@ModelAttribute Student student // name속성과 일치하는 필드에 매핑된다. spring에서 
				, Model model) { // jsp의 주소를 뿌려야함
		// db insert
		studentBO.addStudent(student);
		// db select => 방금 가입된 사람 , INSERT 가 일어난 후 세션 안에서 SELECT가 됨( 세션: INSERT, SELECT 쌍이라고 생각한다.)
		 int id = student.getId();
		 
		// view쪽 모델에 담아야한다.
		
		return "lesson04/afterAddStudent";
	}
}
