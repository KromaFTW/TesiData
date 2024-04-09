package com.postgresql.demosql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;


@EnableNeo4jRepositories(basePackages = {"com.postgresql.demosql.repository_Neo4j"})
@EnableJpaRepositories(basePackages = {"com.postgresql.demosql.repository"})
@SpringBootApplication
public class DemosqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemosqlApplication.class, args);
	}

}
