package com.example.lesson07.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lesson07.entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
	
	// Spring Data JPA DATA: JpaRepository<불려질 entity, pk의 타입>
	
}
