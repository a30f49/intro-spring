package com.citygridmedia.training.spring.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ReporterApp
{
    @Autowired(required = true)
    @Qualifier("htmlReporter")
    private Reporter reporter;
    
    ReporterApp() {
    }
    
    public void run() {
        reporter.generate();
    }
    
    public void setReporter(final Reporter reporter) {
        this.reporter = reporter;
    }

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("xml/application-context.xml");
        ReporterApp app = (ReporterApp)context.getBean("reporterApp");
        app.run();
    }
}
