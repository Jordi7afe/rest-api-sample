package com.sample.ws.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;

/**
 * Created by amalagraba on 11/10/2017.
 * Arteco Consulting Sl
 * mailto: axel@arteco-consulting.com
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    /**
     * Docket factory.
     *
     * @return the docket
     */
    @Bean
    public Docket docketFactory() {
        return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(metadata())
            .directModelSubstitute(LocalDate.class, String.class)
            .directModelSubstitute(LocalDateTime.class, String.class)
            .directModelSubstitute(LocalTime.class, String.class)
            .directModelSubstitute(OffsetDateTime.class, String.class)
            .directModelSubstitute(OffsetTime.class, String.class)
            .genericModelSubstitutes(ResponseEntity.class)
            .useDefaultResponseMessages(false)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.sample"))
            .paths(PathSelectors.any())
            .build();
    }

    /**
     * Metadata.
     *
     * @return the api info
     */
    @Bean
    public ApiInfo metadata() {
        return new ApiInfoBuilder()
            .title("Sample REST API")
            .description("Sample REST API features")
            .version("1.0")
            .build();
    }

    /**
     * Swagger ui config.
     *
     * @return the ui configuration
     */
    @Bean
    public UiConfiguration swaggerUiConfig() {
        return new UiConfiguration(null);
    }
}
