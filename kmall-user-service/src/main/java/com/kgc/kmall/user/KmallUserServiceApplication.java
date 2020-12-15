package com.kgc.kmall.user;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.kgc.kmall.user.mapper")
@SpringBootApplication
public class KmallUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KmallUserServiceApplication.class, args);
	}

}
