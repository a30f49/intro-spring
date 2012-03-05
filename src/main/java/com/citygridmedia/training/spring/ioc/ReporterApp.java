package com.citygridmedia.training.spring.ioc;

public class ReporterApp
{
    public static void main(String[] args)
    {
        Reporter reporter = (Reporter)Container.getComponent(args[0]);
        if (reporter != null) {
            reporter.generate();
        }
    }
}
