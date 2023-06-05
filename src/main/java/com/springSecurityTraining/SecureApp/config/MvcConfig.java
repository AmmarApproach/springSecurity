package com.springSecurityTraining.SecureApp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer{

    public void addViewControllers(ViewControllerRegistry registry){
        //registry.addViewController("/public/login").setViewName("login");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/public/*").setViewName("home");
        registry.addViewController("/admin/*").setViewName("adminPage");
        registry.addViewController("/user/*").setViewName("userPage");
    }
}
