package com.citygridmedia.training.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;

@Configuration
public class ReporterAppConfiguration
{
    @Bean(name="reporterApp")
    @DependsOn("reporter")
    @Scope("prototype")
    public ReporterApp reporterApp() {
        return new ReporterApp(reporter());
    }
    
    @Bean(name="reporter")
    public Reporter reporter() {
        return new HTMLReporter();
    }
}
