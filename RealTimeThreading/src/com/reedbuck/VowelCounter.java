package com.reedbuck;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by saikumar on 8/9/16 at 2:38 PM.
 */
public class VowelCounter implements Runnable{
    private int vowelCount=1;
    FileReader fr;
    private String temp="";

    @Override
    public void run() {
        this.count();
        System.out.println("Vowel Count : "+(this.vowelCount));

    }

    public VowelCounter(String fileName) {
        try {
            this.fr=new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println(e);        }
    }
    public void count(){
        try {
            int i;
            char c;
            while ((i=fr.read())!=-1){
                c=(char)i;
                if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                    vowelCount+=1;
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
