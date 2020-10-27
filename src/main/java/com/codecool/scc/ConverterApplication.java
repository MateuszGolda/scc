package com.codecool.scc;

import com.codecool.scc.file.FilesReader;
import com.codecool.scc.output.OutputFormatterFactory;

public class ConverterApplication {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No input file defined");
            return;
        }

        SimpleCsvConverter converter = new SimpleCsvConverter(new FilesReader(), new OutputFormatterFactory());
        if (args.length == 1) {
            System.out.println("converting to table");
            converter.convert(args[0]);
            return;
        }
        if (args.length == 2) {
            System.out.println("converting to " + args[1]);
            converter.convert(args[1], args[0]);
        }
    }
}
