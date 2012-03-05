package com.citygridmedia.training.spring.ioc;

public class PDFReporter
    implements Reporter
{
    public void generate()
    {
        System.out.println("PDF Report is generated.");
    }
}
