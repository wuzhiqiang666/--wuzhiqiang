package com.monkey1024.intercepter.config;

import com.monkey1024.intercepter.intercepter.MyIntercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//定义的拦截器的配置类
@Configuration
public class IntercepterConfig implements WebMvcConfigurer{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器成功
        InterceptorRegistration ir = registry.addInterceptor(new MyIntercepter());
        //添加拦截请求
        ir.addPathPatterns("/*");
        //添加不拦截的勤求
        ir.excludePathPatterns("/login");
        //等价于上面三行代码
        //registry.addInterceptor(new MyIntercepter()).addPathPatterns("/*").excludePathPatterns("/login");
    }

}
