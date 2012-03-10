package com.citygridmedia.training.ioc;

public class HTMLReporter
    implements Reporter
{
    public void generate()
    {
        System.out.println("HTML Report is generated.");
    }
}
