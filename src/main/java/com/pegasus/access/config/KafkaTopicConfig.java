package com.pegasus.access.config;

import java.util.HashMap;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

	
	@Bean
	public NewTopic genericTopic() {
		var configurations = new HashMap<String, String>();
		configurations.put(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_DELETE);//Politicas para eliminar el mensaje(delete:borra el mensaje, compact: mantiene el mas actual)
		configurations.put(TopicConfig.RETENTION_MS_CONFIG, "86400000");//tiempo de retencion del mensaje
		configurations.put(TopicConfig.SEGMENT_BYTES_CONFIG, "1073741824");//Tamanio del segmento
		configurations.put(TopicConfig.MAX_MESSAGE_BYTES_CONFIG, "1000012");//Tamanio del mensaje
		return TopicBuilder.name("pegasus-topic-access-test")
				.partitions(2)
				.replicas(2)
				.configs(configurations)
				.build();
	}
}
