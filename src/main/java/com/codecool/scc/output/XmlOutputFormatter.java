package com.codecool.scc.output;

import java.util.Scanner;

public class XmlOutputFormatter implements OutputFormatter {
    @Override
    public void printToConsole(Scanner data) {
        String[] headings = data.nextLine().split(",");
        int count = 0;

        String[] line;
        System.out.println("<root>");
        while (data.hasNextLine()) {
            line = data.nextLine().split(",");
            System.out.println("<line " + ++count + ">");
            for (int i = 0; i < line.length; i++) {
                System.out.printf("<%s>%s</%1$s>\n", headings[i], line[i]);
            }
            System.out.println("</line " + count + ">");
        }
        System.out.println("</root>");
    }
}
