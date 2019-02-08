package com.morogoyodesigns.CRM.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;


@Configuration
@EnableSwagger2
public class SwaggerConfig  {

    @Bean
    public Docket getCustomer(){
        return  new Docket(DocumentationType.SWAGGER_2).groupName("customer")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.morogoyodesigns.CRM.client.restControllers"))
                .paths(regex("/customer.*"))
                .build()
                .apiInfo(restControllers());


    }

    private ApiInfo restControllers(){
        return  new ApiInfoBuilder()
                .title("Get customers")
                .description("All restControllers")
                .build();
    }


    @Bean
    public Docket getCompany(){
        return  new Docket(DocumentationType.SWAGGER_2).groupName("company")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.morogoyodesigns.CRM.company.controllers"))
                .paths(regex("/company.*"))
                .build()
                .apiInfo(companyRestControllers());


    }

    private ApiInfo companyRestControllers(){
        return  new ApiInfoBuilder()
                .title("Get Company Info")
                .description("All restControllers related to company information")
                .build();
    }

}
