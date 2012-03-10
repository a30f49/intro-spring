package com.citygridmedia.training.ioc;

public class CSVReporter
    implements Reporter
{
    public void generate()
    {
        System.out.println("CSV Report is generated.");
    }
}
