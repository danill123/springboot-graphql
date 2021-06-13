package com.graphqlJava.GraphqlJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.graphqlJava.query", "com.graphqlJava.service", "com.graphqlJava.resolver"})
@EntityScan("com.graphqlJava.entity")
@EnableJpaRepositories("com.graphqlJava.repository")
public class GraphqlJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlJavaApplication.class, args);
	}

}
