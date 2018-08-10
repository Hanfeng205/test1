package com.deloitte.cmats5;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.deloitte.cmats5.mapper")
public class Cmats5Application {

	public static void main(String[] args) {
		SpringApplication.run(Cmats5Application.class, args);
	}
}
