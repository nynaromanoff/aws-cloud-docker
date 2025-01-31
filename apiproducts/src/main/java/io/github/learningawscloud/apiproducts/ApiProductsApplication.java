package io.github.learningawscloud.apiproducts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiProductsApplication.class, args);
	}

}
