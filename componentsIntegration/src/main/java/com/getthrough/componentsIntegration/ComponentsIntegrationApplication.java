package com.getthrough.componentsIntegration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.getthrough.componentsIntegration.mapper")
public class ComponentsIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComponentsIntegrationApplication.class, args);
	}

}
