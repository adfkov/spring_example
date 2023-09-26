package com.example.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.domain.User;
import com.example.lesson04.mapper.UserMapper;

@Service
public class UserBo {
	// input: 컨트롤러가 받아온 4개의 값
	// output: x
	@Autowired
	private UserMapper userMapper;
	
	public void addUser(String name, String yyyymmdd, String email, String introduce) {
		// insert 후 끝
		userMapper.insertUser(name, yyyymmdd, email, introduce);
	}
	// input: X
	// Output: User(최신 가입자 1명)
	public User getLatestUser() {
		return userMapper.selectLatestUser();
	}
}
