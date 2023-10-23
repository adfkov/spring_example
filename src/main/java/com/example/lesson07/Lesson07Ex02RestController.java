package com.example.lesson07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson07.entity.StudentEntity;
import com.example.lesson07.repository.StudentRepository;

@RestController
@RequestMapping("/lesson07/ex02")
public class Lesson07Ex02RestController {
	// 이번에만 BO 생략
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/1")
	public List<StudentEntity> getStudentList() {
//		return studentRepository.findAllByOrderByIdDesc();
//		return studentRepository.findTop3ByOrderByIdDesc();
		
//		return studentRepository.findByName("조세호");
		
		//5) in문으로 일치하는 값 모두 조회
//		return studentRepository.findByNameIn(List.of("유재석", "조세호", "신보람"));
		
		//6) 여러 칼럼값과 일치하는 데이터 조회
		return studentRepository.findByNameAndDreamjob("조세호","변호사");
		// 7) email 칼럼에 navaer 키워드가 포함된 데이터 조회(like문) - %naver%
//		return studentRepository.findByEmailContaining("naver");
		
		//8) 이름이 유로 시작하는 데이터 조회(like) - 유%
//		return studentRepository.findByNameStartingWith("유");
//		
//		return studentRepository.findByIdBetween(1,5);
	}
	
	@GetMapping("/2")
	public List<StudentEntity> getStudentList2() {
		// 장래희망이 변호사인 데이터 조회
		return studentRepository.findByDreamjob("변호사");
	}
	
}
