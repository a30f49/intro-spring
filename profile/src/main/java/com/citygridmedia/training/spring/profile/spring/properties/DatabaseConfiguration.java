package com.citygridmedia.training.spring.profile.spring.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfiguration
{
    @Value("${db.driver}")    
    private String databaseDriver;
    
    @Value("${db.url}")
    private String databaseUrl;
    
    @Value("${db.username}")
    private String databaseUsername;
    
    @Value("${db.password}")
    private String databasePassword;
    
    @Autowired(required = true)
    private DatabaseProperty databaseProperty;
    
    @Bean(name = "databaseApp")
    public DatabaseApp databaseApp() {
        return new DatabaseApp(databaseProperty);
    }
    
    @Bean(name = "databaseProperty")
    public DatabaseProperty databaseProperty() {
        return new DatabaseProperty(databaseDriver, databaseUrl, databaseUsername, databasePassword);
    }
}

