package com.mybatis.testMybatis;

import com.mybatis.testMybatis.model.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@MapperScan("com.mybatis.testMybatis.mapper")
@MappedTypes(Users.class)
@SpringBootApplication
public class TestMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestMybatisApplication.class, args);
	}
}
