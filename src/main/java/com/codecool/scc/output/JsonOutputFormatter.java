package com.codecool.scc.output;

import java.util.Scanner;

public class JsonOutputFormatter implements OutputFormatter {
    @Override
    public void printToConsole(Scanner data) {
        String[] headings = data.nextLine().split(",");

        String[] line;
        System.out.println("[");
        while (data.hasNextLine()) {
            line = data.nextLine().split(",");
            System.out.println("{");
            for (int i = 0; i < line.length; i++) {
                System.out.printf("%s: \"%s\",\n", headings[i], line[i]);
            }
            System.out.println("},");
        }
        System.out.println("]");
    }
}
