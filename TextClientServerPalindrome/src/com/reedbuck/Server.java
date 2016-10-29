package com.reedbuck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by saikumar on 28/10/16 at 2:14 PM.
 */
public class Server {
    public static void main(String[] args) {
        int port=6500;
        try {
            ServerSocket serverSocket=new ServerSocket(port);
            System.out.println("Palindrome Checking Server started at port : "+port);
            boolean flag=true;
            while (flag){
                Socket clientSocket=serverSocket.accept();
                BufferedReader serverIn=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter serverOut=new PrintWriter(clientSocket.getOutputStream(),true);
                String line="";
                while((line=serverIn.readLine())!=null){
                    if (line.equalsIgnoreCase("bye")){
                        flag=false;
                        System.out.println("Palindrome Server is shutting down");
                        serverOut.println("Palindrome Server has shut down");
                        serverOut.flush();
                        serverIn.close();
                        serverOut.close();
                        break;
                    }else {
                        System.out.println("Server got word : "+line);
                        serverOut.println(palindromeChecker(line));
                        serverOut.flush();
                    }
                }
            }
            serverSocket.close();

        } catch (IOException e) {
            System.out.println(e);
        }

    }
    public static int palindromeChecker(String string){
        int n=string.length();
        for (int i=0;i<n/2;i++){
            if (string.charAt(i)!=string.charAt(n-i-1)){
                return 0;
            }
        }
        return 1;
    }
}
