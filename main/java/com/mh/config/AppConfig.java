package com.mh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {

    // If you already had beans in AppConfig, keep them here.
    // For example:
    // @Bean
    // public SomeService someService() { return new SomeService(); }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // apply CORS to all endpoints
                .allowedOrigins("http://localhost:4800") // Angular dev server
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
