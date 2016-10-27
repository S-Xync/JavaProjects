package com.reedbuck;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String[] arr;
        //String[] arr1;
        String st="1+8-10+9-10";
//        arr=st.split("[+ -]");
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        StringTokenizer tokens=new StringTokenizer(st,"+-");
        while(tokens.hasMoreTokens()){
            System.out.println(tokens.nextToken());
        }
    }
}

