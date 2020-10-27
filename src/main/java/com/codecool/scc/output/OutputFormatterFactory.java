package com.codecool.scc.output;

import org.springframework.stereotype.Service;

@Service
public class OutputFormatterFactory {
    public OutputFormatter createByFormat(String outputFormat) {
        if (outputFormat.equals("xml")) return new XmlOutputFormatter();
        if (outputFormat.equals("json")) return new JsonOutputFormatter();
        if (outputFormat.equals("table")) return new TableOutputFormatter();
        throw new IllegalArgumentException("Provided type is not supported");
    }
}
