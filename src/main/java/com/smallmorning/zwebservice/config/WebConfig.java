package com.smallmorning.zwebservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        //本机
        registry.addResourceHandler("/desurl/**").addResourceLocations("file:D:/apprep/image/");
        //下载类的需要这个模板，非下载类的不需要转换
        registry.addResourceHandler("/apppackageurl/**").addResourceLocations("file:D:/apprep/package/");

        //云主机
        //Linux
        //registry.addResourceHandler("/desurl/**").addResourceLocations("file:/apprep/image/");
        //registry.addResourceHandler("/apppackageurl/**").addResourceLocations("file:/apprep/package/");

        //windows
        //registry.addResourceHandler("/videos/**").addResourceLocations("file:C:/videos/sh/");
        //registry.addResourceHandler("/covers/**").addResourceLocations("file:C:/cover/");
    }
}
