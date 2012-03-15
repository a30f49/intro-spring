package com.citygridmedia.training.spring.profile.maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DatabaseApp
{
    private DatabaseProperty databaseProperty;
    
    public DatabaseApp(final DatabaseProperty databaseProperty) {
        this.databaseProperty = databaseProperty;
    }
    
    public void run() {
        System.out.println(databaseProperty.toString());
    }

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("maven/application-context.xml");
        DatabaseApp app = (DatabaseApp)context.getBean("databaseApp");
        app.run();
    }
}
