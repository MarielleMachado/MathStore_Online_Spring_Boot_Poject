package com.MathStore.tiendita_online.backend.infrastucture;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.MathStore.tiendita_online"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("API de MathStore")
                .description("Documentación de la API para MathStore")
                .version("1.0.0")
                .termsOfServiceUrl("https://www.mathstore.com/terms")
                .contact(new Contact("Soporte MathStore", "https://www.mathstore.com/contact", "soporte@mathstore.com"))
                .license("Licencia de MathStore")
                .licenseUrl("https://www.mathstore.com/license")
                .build();
    }
}
