package com.codecool.scc;

import com.codecool.scc.file.FilesReader;
import com.codecool.scc.output.OutputFormatterFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean(name = "filesReader")
    public FilesReader reader() {
        return new FilesReader();
    }

    @Bean(name = "outputFormatterFactory")
    public OutputFormatterFactory formatterFactory() {
        return new OutputFormatterFactory();
    }

    @Bean(name = "simpleCsvConverter")
    public SimpleCsvConverter csvConverter() {
        return new SimpleCsvConverter();
    }
}
