package com.micro.service.galaxycollector;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.micro.service.galaxycollector.dao")
public class GalaxyCollectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(GalaxyCollectorApplication.class, args);
	}

}
