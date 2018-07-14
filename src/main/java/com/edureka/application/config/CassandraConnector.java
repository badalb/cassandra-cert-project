package com.edureka.application.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Cluster.Builder;

@Configuration
public class CassandraConnector {

	@Value("${edureca.cassandra.host}")
	private String host;

	@Value("${edureca.cassandra.port}")
	private Integer port;

	private Cluster cluster;

	@Bean
	public Cluster createCluster() {
		Builder b = Cluster.builder().addContactPoint(host);

		if (port != null) {
			b.withPort(port);
		}

		cluster = b.build();
		return cluster;
	}

}