package com.example.lesson04.bo;

import java.time.ZonedDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.domain.Student;
import com.example.lesson04.mapper.StudentMapper;
import com.example.lesson07.entity.StudentEntity;
import com.example.lesson07.repository.StudentRepository;

@Service
public class StudentBO {
	@Autowired
	private StudentMapper studentMapper; // mybatis
	
	@Autowired
	private StudentRepository studentRepository;
	
	public void addStudent(Student student) {
		studentMapper.insertStudent(student);
	}
	
	public void getStudentById(int id) {
		studentMapper.loadStudentById(id);
	}
	
	// jpa ------------------
	// input: 파라미터들 output: StudentEntity
	public StudentEntity addStudent(String name, String phoneNumber, String email, String dreamJob) {
		StudentEntity student = StudentEntity.builder()
				.name(name)
				.phoneNumber(phoneNumber)
				.email(email)
				.dreamjob(dreamJob)
				.createdAt(ZonedDateTime.now()) // @UpdateTimestamp 있으면 생략 가능
				.build();
		return studentRepository.save(student); // insert 문을 만든다.
		
	}
	// input: id, dreamJob
	public StudentEntity updateStudentDreamJobById(int id, String dreamjob) {
		
		StudentEntity student = studentRepository.findById(id).orElse(null);
		if(student != null) {
			// 기존값은 유지하고 세팅된 일부의 값만 변경(dreamJob만) => toBuilder
			student = student.toBuilder()
			.dreamjob(dreamjob)
			.build();
			
			// update
			student = studentRepository.save(student); // db update 후 다시 셀렉트 된 결과
		}
		
		return student; // null 또는 변경된 데이터
	}
	// input: id , output: x
	public void deleteStudentById(int id) {
		// 방법 1)
//		StudentEntity student = studentRepository.findById(id).orElse(null);
//		if(student != null) {
//			studentRepository.delete(student);
//		}
		
		// 방법2)
		Optional<StudentEntity> studentOptional = studentRepository.findById(id);
		studentOptional.ifPresent(s -> studentRepository.delete(s)); // 괄호 안에 이름 암거나 짓기
		
	}
}
