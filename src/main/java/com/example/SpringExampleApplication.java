package com.example;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@MapperScan(basePackages ="com.example.*") // repository 위치를 찾아줌


@SpringBootApplication // 스프링 구동을 위한 필수 어노테이션 , 스프링 빈으로 등록됨
	public class SpringExampleApplication {

		public static void main(String[] args) {
			SpringApplication.run(SpringExampleApplication.class, args);
			}

		 @Bean
		    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		        sessionFactory.setDataSource(dataSource);

		        Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mappers/*Mapper.xml");
		        sessionFactory.setMapperLocations(res);

		        return sessionFactory.getObject();
		    }
}
