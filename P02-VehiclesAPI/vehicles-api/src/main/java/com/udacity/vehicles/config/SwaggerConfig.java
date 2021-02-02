package com.udacity.vehicles.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import java.util.Collections;

//Credits :: Udacity Learning Lessons.
    @Configuration
    @EnableSwagger2
    public class SwaggerConfig {
        @Bean
        public Docket api() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.any())
                    .paths(PathSelectors.any())
                    .build()
                    .useDefaultResponseMessages(true);
        }

        private ApiInfo apiInfo() {
            return new ApiInfo(
                    "Vehicles API",
                    "This API returns a list of Vehicles.",
                    "1.0",
                    "http://www.yash.com/tos",
                    new Contact("Yash Gupta", "www.yash.com", "myeaddress@gmail.com"),
                    "License of API", "http://www.yash.com/license", Collections.emptyList());
        }


    }

