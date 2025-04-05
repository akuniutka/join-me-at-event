package io.github.akuniutka.jmae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServer {

    public static void main(final String[] args) {
        SpringApplication.run(DiscoveryServer.class, args);
    }
}
