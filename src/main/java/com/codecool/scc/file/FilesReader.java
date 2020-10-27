package com.codecool.scc.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesReader {
    public Scanner readData(String filePath) {
        Scanner sc = null;
        try {
            File file = new File(filePath);
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sc;
    }
}
