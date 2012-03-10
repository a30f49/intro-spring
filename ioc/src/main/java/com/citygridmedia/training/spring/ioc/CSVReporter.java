package com.citygridmedia.training.spring.ioc;

import org.springframework.stereotype.Component;

@Component("csvReporter")
public class CSVReporter
    implements Reporter
{
    public void generate()
    {
        System.out.println("CSV Report is generated.");
    }
}
