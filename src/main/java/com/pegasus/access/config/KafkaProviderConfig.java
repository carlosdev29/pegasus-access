package com.pegasus.access.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
public class KafkaProviderConfig {
	
	@Value("${spring.kafka.bootstrap-servers}")
	private String boostrapServers;
	
	
	public Map<String, Object> providerConfig() {
		var properties = new HashMap<String, Object>();
		properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, boostrapServers);
		properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		return properties;
	}
	
	@Bean
	public ProducerFactory<String, String> providerFactory () {
		return new DefaultKafkaProducerFactory<>(providerConfig());
	}
	
	@Bean 
	public KafkaTemplate<String, String> kafkaTemplate (ProducerFactory<String, String>producerFactory) {
		return new KafkaTemplate<>(producerFactory);
	} 
	
	
}
