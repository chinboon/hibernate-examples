package com.github.chinboon.hibernate_examples.hibernate_52_jdk_8_eap_7_db2_97.web.bootstrap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.regex("/.*")).build().apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("hibernate examples").description("hibernate_5.2-jdk_8-eap_7-db2_9.7")
				.version("VERSION").termsOfServiceUrl("https://github.com/chinboon/hibernate-examples")
				.license("LICENSE").licenseUrl("https://github.com/chinboon/hibernate-examples").build();
	}

}