package com.mh.MHB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.mh")
@EnableJpaRepositories(basePackages = "com.mh.repository")
@EntityScan(basePackages = "com.mh.entity")
public class MhbApplication {
    public static void main(String[] args) {
        SpringApplication.run(MhbApplication.class, args);
    }
}
