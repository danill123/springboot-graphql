package com.graphqlJava.GraphqlJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.graphqlJava.query"})
public class GraphqlJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlJavaApplication.class, args);
	}

}
