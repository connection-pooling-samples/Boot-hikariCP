package com.rudra.aks.hikari;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class HikariCPApp {

	public static void main(String[] args) {
		System.getProperties().put("server.port", 8234);
		SpringApplication.run(HikariCPApp.class, args);
	}

	@Autowired
	DataSource	dataSource;
	
	@Bean
	public	JdbcTemplate	jdbcTemplate() {
		return new JdbcTemplate(dataSource);
	}
}
