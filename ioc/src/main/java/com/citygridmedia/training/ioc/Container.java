package com.citygridmedia.training.ioc;

import java.util.HashMap;
import java.util.Map;

public class Container
{
    private static Map<String, Object> container;
    
    public synchronized static Object getComponent(final String componentName) {
        if (container == null) {
            container = new HashMap<String, Object>();
        }
        
        Object result = container.get(componentName);
        if (result == null) {
            if ("pdfReporter".equals(componentName)) {
                result = new PDFReporter();
            } else if ("htmlReporter".equals(componentName)) {
                result = new HTMLReporter();
            } else if ("csvReporter".equals(componentName)) {
                result = new CSVReporter();
            }
            
            if (result != null) {
                container.put(componentName, result);
            }
        }
        
        return result;
    }
}
