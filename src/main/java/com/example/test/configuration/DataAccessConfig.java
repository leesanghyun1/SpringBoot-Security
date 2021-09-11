package com.example.test.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataAccessConfig {
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }
}
