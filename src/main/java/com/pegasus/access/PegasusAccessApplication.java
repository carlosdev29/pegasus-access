package com.pegasus.access;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class PegasusAccessApplication {

	public static void main(String[] args) {
		SpringApplication.run(PegasusAccessApplication.class, args);
	}
	
	
	@Bean
	CommandLineRunner init(KafkaTemplate<String, String> kafkaTemplate) {
		return args -> {
			kafkaTemplate.send("pegasus-topic-access-test", "Hola Dulce ahora si nos fuimos con kaffka");
		};
	}

}
