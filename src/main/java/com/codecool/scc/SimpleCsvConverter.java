package com.codecool.scc;

import com.codecool.scc.file.FilesReader;
import com.codecool.scc.output.OutputFormatterFactory;

public class SimpleCsvConverter {
    private FilesReader filesReader;
    private OutputFormatterFactory outputFormatterFactory;

    void convert(String filePath, String outputFormat) {
        outputFormatterFactory.createByFormat(outputFormat).printToConsole(filesReader.readData(filePath));
    }

    void convert(String filePath) {
        convert(filePath, "table");
    }

    public void setFilesReader(FilesReader filesReader) {
        this.filesReader = filesReader;
    }

    public void setOutputFormatterFactory(OutputFormatterFactory outputFormatterFactory) {
        this.outputFormatterFactory = outputFormatterFactory;
    }
}
