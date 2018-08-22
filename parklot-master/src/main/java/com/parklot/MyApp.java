package com.parklot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.WebApplicationInitializer;

/*
 * @SpringBootApplication用来标注主程序
 */
@SpringBootApplication
public class MyApp extends SpringBootServletInitializer implements WebApplicationInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){

		return application.sources(MyApp.class);
	}
	public static void main(String[] args) {
		//spring应用启动.run()
		SpringApplication.run(MyApp.class, args);
	}

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(WebApplication.class);
//	}
	
	//@Bean    //告诉spring，你可以从下面的方法中得到一个bean
//	public EmbeddedServletContainerCustomizer containerCustomizer() {
//
//	   return (container -> {
//	        ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
//
//	        container.addErrorPages( error404Page);
//	   });
//	}
}
