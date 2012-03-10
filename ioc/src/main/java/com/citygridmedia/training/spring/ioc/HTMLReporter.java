package com.citygridmedia.training.spring.ioc;

import org.springframework.stereotype.Component;

@Component("htmlReporter")
public class HTMLReporter
    implements Reporter
{
    public void generate()
    {
        System.out.println("HTML Report is generated.");
    }
}
