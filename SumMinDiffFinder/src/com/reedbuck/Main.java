package com.reedbuck;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Give numbers with spaces in between.");
        System.out.println("Give Array A : ");
        String A=scanner.nextLine();
        System.out.println("Give Array B : ");
        String B=scanner.nextLine();
        String[] aString=A.split(" ");
        String[] bString=B.split(" ");
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        for (int i=0;i<aString.length;i++){
            a.add(Integer.valueOf(aString[i]));
        }

        for (int i=0;i<bString.length;i++){
            b.add(Integer.valueOf(bString[i]));
        }
        ArrayList<Integer> result;
        result=finder(a,b);
        System.out.println("The number from First array is "+result.get(0));
        System.out.println("The number from Second array is "+result.get(1));
    }
    public static ArrayList<Integer> finder(ArrayList<Integer> a,ArrayList<Integer> b){


    }
}
