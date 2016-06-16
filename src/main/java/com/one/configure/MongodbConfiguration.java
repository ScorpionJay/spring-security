package com.one.configure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

/**
 * @author jay
 * @since 2016.6.16
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.............repo")
public class MongodbConfiguration extends AbstractMongoConfiguration {

	@Value("${mongo.host}")
	private String MONGO_DB_HOST;

	@Value("${mongo.port}")
	private int MONGO_DB_PORT;

	@Value("${mongo.db}")
	private String DB;

	@Override
	protected String getDatabaseName() {
		return DB;
	}

	@Bean
	@Override
	public Mongo mongo() throws Exception {
		return new MongoClient(MONGO_DB_HOST, MONGO_DB_PORT);
	}
}