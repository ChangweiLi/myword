package com.scau.myword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.scau.myword.pojo")
@EnableJpaRepositories(basePackages = ("com.scau.myword.repository"))
@SpringBootApplication
public class MywordApplication {

	public static void main(String[] args) {
		SpringApplication.run(MywordApplication.class, args);
	}

}
