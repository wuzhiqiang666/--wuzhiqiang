package com.monkey1024.intercepter.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean myFilterRegistration(){
        FilterRegistrationBean frb = new FilterRegistrationBean();
        //过滤那些请求
        frb.addUrlPatterns("/*");
        return frb;
    }
}
