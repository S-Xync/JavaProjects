package com.reedbuck;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        try {
            FileReader fr =new FileReader("Test");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
