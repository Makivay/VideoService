package ru.makivay.webguinode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class WebGuiNodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebGuiNodeApplication.class, args);
    }

}
