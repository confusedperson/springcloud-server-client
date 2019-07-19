package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务器消费者
 * @author lvj
 *
 */
@SpringBootApplication
@RestController
@EnableEurekaClient
@ComponentScan(basePackages = {"com.example.demo.service","com.example.demo.controller"})
@MapperScan("com.example.demo.mapper")
public class SpringcloudServerClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudServerClientApplication.class, args);
	}
	
//	@Value("${server.port}") // 读取配置文件的端口
//	String port;
//	
//	/**
//	 * 设置一个方法
//	 * 参数什么的 可以用HttpServletRequest  也可以用 @RequestParam
//	 * 测试我就不添加了
//	 * @return
//	 */
//	@RequestMapping(value="/test")
//	public String testMethod() { 
//		return "Hello World!!! 端口为:" + port;
//	}
}
