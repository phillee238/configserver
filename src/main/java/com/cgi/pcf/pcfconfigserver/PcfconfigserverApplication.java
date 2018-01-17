package com.cgi.pcf.pcfconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PcfconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcfconfigserverApplication.class, args);
	}
}
