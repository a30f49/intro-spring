package com.citygridmedia.training.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReporterApp
{
    private Reporter reporter;
    
    ReporterApp(final Reporter reporter) {
        this.reporter = reporter;
    }
    
    public void run() {
        reporter.generate();
    }

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("javaconfig/application-context.xml");
        ReporterApp app = (ReporterApp)context.getBean("reporterApp");
        app.run();
    }
}
