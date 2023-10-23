package com.example.lesson07.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson07.entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
	
	// Spring Data JPA DATA: JpaRepository<불려질 entity, pk의 타입>
	
	// save() - insert, update
	// findById - select
	// delete - delete
	// findAll() - 전체 조회
	
	// JPQL 문법 - ex02/1 2) id 기준 내림차순 전체 조회 
	public List<StudentEntity> findAllByOrderByIdDesc(); // 리스트 조회 
	
	// 3)id 기준 내림차순 3개만 조회
	public List<StudentEntity> findTop3ByOrderByIdDesc();
	
	//4) 이름이 조세호인 데이터 조회
	public List<StudentEntity> findByName(String name);
	public List<StudentEntity> findByNameIn(List<String> names);

	public List<StudentEntity> findByNameAndDreamjob(String name, String dreamjob);
	public List<StudentEntity> findByEmailContaining(String email);
	public List<StudentEntity> findByNameStartingWith(String name);
	public List<StudentEntity> findByIdBetween(int start, int end);
	
	// ex02/2
	// 1) JPQL 엔티티로 조회
	@Query(value = "select st from studentinfo st where st.dreamjob = :dreamjob") // 별칭 st로 엔티티 가져온다.
	public List<StudentEntity> findByDreamjob(@Param("dreamjob") String dreamjob); // mybatis 아님

	
	
}

