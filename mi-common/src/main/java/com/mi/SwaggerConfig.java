package com.mi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * Swagger配置模版（各自项目可粘帖到自个项目使用）
 * @authoryesh
 *         (M.M)!
 *         Created by 2017/5/7.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {


    @Value("${server.port}")
    private String serverPort;

    private String contentPath;

    @Bean
    public Docket createRestApi() {
        System.err.println("Swagger地址：http://localhost:"+serverPort+"/swagger-ui.html");
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(initApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mi"))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo initApiInfo() {
        return new ApiInfoBuilder()
                .title("MI-XX 项目 Platform API")
                .description(initContextInfo())
                .version("1.0.0")
                .termsOfServiceUrl("服务团队HTTP地址")
                .contact("MIYAOW")
                .license("请联系我的博客")
                .licenseUrl("http://blog.csdn.net/fjnpysh")
                .build();
    }

    private String initContextInfo() {
        StringBuffer sb = new StringBuffer();
        sb.append("REST API 设计在细节上有很多自己独特的需要注意的技巧，并且对开发人员在构架设计能力上比传统 API 有着更高的要求。")
                .append("<br/>")
                .append("本文通过翔实的叙述和一系列的范例，从整体结构，到局部细节，分析和解读了为了提高易用性和高效性，REST API 设计应该注意哪些问题以及如何解决这些问题。");

        return sb.toString();
    }


}
