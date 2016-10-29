package com.reedbuck;

import java.io.*;
import java.net.Socket;

/**
 * Created by saikumar on 28/10/16 at 2:15 PM.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("Client trying to connect to Palindrome Server at port : "+6500);
        try {
            Socket clientSocket=new Socket("localhost",6500);
            BufferedReader clientIn=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter clientOut=new PrintWriter(clientSocket.getOutputStream());
            FileReader fr=new FileReader("./src/word.txt");
            FileWriter fw=new FileWriter("./src/answer.txt");
            BufferedReader br=new BufferedReader(fr);
            String line="";
            while ((line=br.readLine())!=null){
                System.out.println("Sending : "+line);
                clientOut.println(line);
                clientOut.flush();
            }
            clientOut.println("Bye");
            clientOut.flush();
            while ((line=clientIn.readLine())!=null){
                fw.write(line+"\n");
            }
            System.out.println("Results written to answer.txt");
            clientIn.close();
            clientOut.close();
            clientSocket.close();
            fr.close();
            br.close();
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
