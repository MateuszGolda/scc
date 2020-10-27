package com.codecool.scc;

import com.codecool.scc.file.FilesReader;
import com.codecool.scc.output.OutputFormatterFactory;

public class SimpleCsvConverter {
    private final FilesReader filesReader;
    private final OutputFormatterFactory outputFormatterFactory;

    public SimpleCsvConverter(FilesReader filesReader, OutputFormatterFactory outputFormatterFactory) {
        this.filesReader = filesReader;
        this.outputFormatterFactory = outputFormatterFactory;
    }

    void convert(String filePath, String outputFormat) {
        outputFormatterFactory.createByFormat(outputFormat).printToConsole(filesReader.readData(filePath));
    }

    void convert(String filePath) {
        convert(filePath, "table");
    }
}
