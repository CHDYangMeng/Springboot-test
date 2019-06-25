package com.jtkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.jtkj.mapper")
public class JtkjApplication {

	public static void main(String[] args) {
		SpringApplication.run(JtkjApplication.class, args);
	}

}
