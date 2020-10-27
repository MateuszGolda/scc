package com.codecool.scc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConverterApplication {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No input file defined");
            return;
        }

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath:META-INF/beans.xml");
        SimpleCsvConverter converter = applicationContext.
                getBean("simpleCsvConverter", SimpleCsvConverter.class);

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
