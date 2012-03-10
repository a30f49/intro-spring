package com.citygridmedia.training.spring.javaconfig;


public class CSVReporter
    implements Reporter
{
    public void generate()
    {
        System.out.println("CSV Report is generated.");
    }
}
