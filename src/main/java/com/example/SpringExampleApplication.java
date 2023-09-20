package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

@SpringBootApplication // 스프링 구동을 위한 필수 어노테이션 , 스프링 빈으로 등록됨
	public class SpringExampleApplication {

		public static void main(String[] args) {
			SpringApplication.run(SpringExampleApplication.class, args);
			}

	}
