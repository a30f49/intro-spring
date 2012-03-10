package com.citygridmedia.training.spring.javaconfig;


public class PDFReporter
    implements Reporter
{
    public void generate()
    {
        System.out.println("PDF Report is generated.");
    }
}
