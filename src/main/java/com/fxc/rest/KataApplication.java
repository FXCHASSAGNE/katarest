package com.fxc.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Springboot init app
 * @author fxcha
 *
 */
@SpringBootApplication
public class KataApplication {

	public static void main(String[] args) {
		SpringApplication.run(KataApplication.class, args);
	}
	
	/**
	 * enable swagger usage
	 * http://<serverAdress>/swagger-ui/
	 * @return swagger documentation
	 */
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.fxc.rest"))
				.paths(PathSelectors.any())
				.build()
				.pathMapping("/");
	}

}
