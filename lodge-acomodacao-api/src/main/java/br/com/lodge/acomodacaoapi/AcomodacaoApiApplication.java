package br.com.lodge.acomodacaoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AcomodacaoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcomodacaoApiApplication.class, args);
	}

}
