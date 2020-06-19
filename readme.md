# 项目说明

一个简单的SpringBoot示例。

# 基本操作

## 命令行直接编译运行：

	mvnw compile spring-boot:run

## 命令行打包和运行：

	mvnw clean package -Dmaven.test.skip=true

	java -jar target/springboot-example-0.0.1-SNAPSHOT.jar

# 功能

## v0

这个版本是一个最简单的SpringBoot程序，可以启动运行，但没有任何实际的功能。

pom.xml 是 Maven 的配置文件。

几个名字里带 mvnw 的文件和子目录是命令行工具，如果开发环境中已经有了 Maven 支持，那么这些就不必要了。

程序文件只有一个 ExampleApplication.java 作为 SpringBoot 的启动点。

application.properties 文件是程序运行后加载配置参数的文件，现在还是空的，因为还没有实现任何功能。

## v1

引入了 spring-boot-starter-web 模块，这里面就包含了 SpringMVC。

WebMvcConfig.java 不是必需的，如果需要的话，可以用来对 SpringMVC 做一些初始化配置。

IndexController.java 用于处理具体的请求。文件名和方法名都不重要，靠注解来映射处理关系。
