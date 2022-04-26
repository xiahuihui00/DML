package com.hui.xiaomi.config;

import com.hui.xiaomi.Intercepter.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Config implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        MyInterceptor interceptor =new MyInterceptor();
        registry.addInterceptor(interceptor).
                addPathPatterns("/**").
                excludePathPatterns("/action/loginin").
                excludePathPatterns("/action/register").
                excludePathPatterns("/action/updateCustomerPwd");
    }
}
