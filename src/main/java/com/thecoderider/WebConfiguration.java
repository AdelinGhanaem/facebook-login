package com.thecoderider;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Adelin_Ghanayem on 19-Apr-17.
 */
@Configuration
@ComponentScan(basePackages = "com.instantadd.web.controllers")
@EnableWebMvc
public class WebConfiguration extends WebMvcConfigurerAdapter {




    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
        registry.addResourceHandler("**/*.html","**/*.css","**/*.js").addResourceLocations("*/**");
        registry.addResourceHandler("**/*.html","**/*.css","**/*.js").addResourceLocations("/");
    }


}
