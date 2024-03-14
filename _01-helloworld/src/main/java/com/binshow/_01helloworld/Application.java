package com.binshow._01helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. 为什么依赖不需要写版本？
 *  每个boot项目都有一个父项目spring-boot-starter-parent
 *  parent的父项目是spring-boot-dependencies
 *  父项目 版本仲裁中心，把所有常见的jar的依赖版本都声明好了
 *
 * 2. Starter 是什么？
 *   它是一组预定义的依赖项集合，旨在简化Spring应用程序的配置和构建过程。Starter包含了一组相关的依赖项，
 *   以便在启动应用程序时自动引入所需的库、配置和功能。主要作用如下：
 *      2.1 简化依赖管理：Spring Boot Starter通过捆绑和管理一组相关的依赖项，减少了手动解析和配置依赖项的工作。
 *          只需引入一个相关的Starter依赖，即可获取应用程序所需的全部依赖。
 *      2.2 自动配置：Spring Boot Starter在应用程序启动时自动配置所需的组件和功能。通过根据类路径和其他设置的自动检测
 *      2.3 提供约定优于配置：Spring Boot Starter遵循“约定优于配置”的原则，通过提供一组默认设置和约定，减少了手动配置的需要。
 *      它定义了标准的配置文件命名约定、默认属性值、日志配置等，使得开发者可以更专注于业务逻辑而不是繁琐的配置细节
 *
 *      命名规范：
 * - 官方提供的场景：命名为：`spring-boot-starter-*`
 * - 第三方提供场景：命名为：`*-spring-boot-starter`
 *
 * 3. @SpringBootApplication注解的功效？如何实现的自动配置？
 *
 */

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
