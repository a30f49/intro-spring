package com.citygridmedia.training.ioc;

public class PDFReporter
    implements Reporter
{
    public void generate()
    {
        System.out.println("PDF Report is generated.");
    }
}
