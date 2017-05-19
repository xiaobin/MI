# MI
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](http://blog.csdn.net/fjnpysh)
[![GitHub stars](https://img.shields.io/github/stars/MIYAOW/MI.svg?style=social&label=Stars)](https://github.com/MIYAOW/MI)
[![GitHub forks](https://img.shields.io/github/forks/MIYAOW/MI.svg?style=social&label=Fork)](https://github.com/MIYAOW/MI)

## 项目建议

   希望大家一起共同研究。更多的解决方法。

## 项目规划

   `MI`微型系统项目于2017年4月1日按照企业习惯归纳总结出自己一套企业级架构，并仅仅只是架构，它是一种理念，正在成长中.....

## 项目介绍

　　基于 **Spring Boot** + **Spring Cloud** + **Swagger2** 搭建的分布式敏捷开发系统架构，为中、小型项目打造企业级基础开发解决方案。


## 环境搭建

#### 开发工具
- **IntelliJ IDEA Version(2017.1)** for Code IDE
- **MySQL** or **Oracle** for Database
- **Plsql** or **Navicat** for DatabaseClient
    
#### 开发环境
- Jdk 8
- Redis


## 技术掌握
#### 前端技术
技术 | 名称 | 官网
----|------|----
Editor.md | Markdown编辑器  | [https://github.com/pandao/editor.md](https://github.com/pandao/editor.md)
Select2 | 选择框插件  | [https://github.com/select2/select2](https://github.com/select2/select2)

#### 后端技术
技术 | 名称 | 官网
----|------|----
Maven | 项目构建管理  | [http://maven.apache.org/](http://maven.apache.org/)
Redis | 分布式缓存数据库  | [https://redis.io/](https://redis.io/)
Spring Boot | 微框架  | [https://projects.spring.io/spring-boot/](https://projects.spring.io/spring-boot/)
Spring Cloud | 微服务构架（中文）  | [https://springcloud.cc/](https://springcloud.cc/)
Eureka | 云端服务发现  | [https://springcloud.cc/spring-cloud-netflix-zhcn.html/](https://springcloud.cc/spring-cloud-netflix-zhcn.html/)
Swagger2 | API文档框架  | [http://swagger.io/](http://swagger.io/)
Spring Boot Admin | 应用监控中心V1.5.0  | [http://codecentric.github.io/spring-boot-admin/1.5.0/](http://codecentric.github.io/spring-boot-admin/1.5.0/)
Spring Security | 安全框架  | [http://projects.spring.io/spring-security/](http://projects.spring.io/spring-security/)



## 解决问题
                
+ **部署问题**
    +  **从git上克隆下来的时候项目pom.xml文件是xml格式请根据自己的编译器转换格式**
        
        IDEA:选择pom右键--->+Add as Maven Project 稍等即可
     
    + **首先若使用API 先启动注册中心、服务提供者、消费者。**
