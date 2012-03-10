package com.citygridmedia.training.spring.ioc;

import org.springframework.stereotype.Component;

@Component("pdfReporter")
public class PDFReporter
    implements Reporter
{
    public void generate()
    {
        System.out.println("PDF Report is generated.");
    }
}
