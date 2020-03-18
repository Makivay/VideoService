package ru.makivay.discoverynode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryNodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryNodeApplication.class, args);
    }

}
