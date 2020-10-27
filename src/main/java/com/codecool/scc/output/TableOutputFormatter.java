package com.codecool.scc.output;

import java.util.Scanner;

public class TableOutputFormatter implements OutputFormatter {
    @Override
    public void printToConsole(Scanner data) {
        int minLineLength = 25;
        String[] line;
        while (data.hasNextLine()) {
            line = data.nextLine().split(",");
            System.out.println(("-".repeat(minLineLength) + "+").repeat(line.length));
            for (String s : line) {
                System.out.printf("%-" + minLineLength + "s| ", s);
            }
            System.out.println();
        }
    }
}
