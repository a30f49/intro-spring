package com.citygridmedia.training.spring.profile.maven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfiguration
{
    @Autowired(required = true)
    private DatabaseProperty databaseProperty;
    
    @Bean(name = "databaseApp")
    public DatabaseApp databaseApp() {
        return new DatabaseApp(databaseProperty);
    }
}
