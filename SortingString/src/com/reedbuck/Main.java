package com.reedbuck;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        StringBuilder result=sortString(s);
        System.out.println(result);

    }
    public static StringBuilder sortString(String a){
        StringBuilder result=null;
        int[] lowerCount=new int[26];
        int[] upperCount=new int[26];
        for (int i=0;i<26;i++) {
            lowerCount[i] = 0;
            upperCount[i] = 0;
        }
        for (int i=0;i<a.length();i++){
            if (a.charAt(i)>=65&&a.charAt(i)<=90){
                upperCount[(a.charAt(i)-65)]+=1;
            }else if(a.charAt(i)>=97&&a.charAt(i)<=122){
                lowerCount[(a.charAt(i)-97)]+=1;
            }
        }
        for (int i=0;i<26;i++){
            StringBuilder r=buildString(((char) (i+65)),upperCount[i]);
            if (r!=null){
                result.append(r);
            }
            r=buildString(((char) (i+97)),lowerCount[i]);
            if (r!=null){
                result.append(r);
            }
        }
        return result;
    }

    public static StringBuilder buildString(char input,int num){
        StringBuilder result=null;
        for (int i=0;i<num;i++){
            result.append(String.valueOf(input));
        }
        return result;
    }
}
