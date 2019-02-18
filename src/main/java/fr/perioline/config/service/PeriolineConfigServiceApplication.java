package fr.perioline.config.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class PeriolineConfigServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(PeriolineConfigServiceApplication.class, args);
	}

}

