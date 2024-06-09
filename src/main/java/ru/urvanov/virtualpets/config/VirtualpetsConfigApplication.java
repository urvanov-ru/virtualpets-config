package ru.urvanov.virtualpets.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class VirtualpetsConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(VirtualpetsConfigApplication.class, args);
    }

}
