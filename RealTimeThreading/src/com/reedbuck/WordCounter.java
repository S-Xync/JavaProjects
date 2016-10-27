package com.reedbuck;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by saikumar on 8/9/16 at 2:38 PM.
 */
public class WordCounter implements Runnable{
    private int wordCount=0;
    FileReader fr;
    private String temp="";

    @Override
    public void run() {
        this.count();
        System.out.println("Word Count : "+(this.wordCount+1));
    }

    public WordCounter(String fileName) {
        try {
            this.fr=new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println(e);        }
    }
    public void count(){
        try {
            int i;
            while ((i=fr.read())!=-1){
                if ((char) i==' '){
                this.wordCount+=1;
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
