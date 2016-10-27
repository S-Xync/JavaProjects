package com.reedbuck;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        int n;
        for (int i=0;i<t;i++){
            n=scanner.nextInt();
            System.out.println(EvenFibSumLessThanN(n));
        }
    }
    public static long EvenFibSumLessThanN(int n){
        long result=0;
        ArrayList<Integer> fibArr=new ArrayList<>();
        fibArr.add(1);
        fibArr.add(2);
//        if (n>2){
//            result=2;
//        }
        int i=1;
        while (fibArr.get(i)<=n){
            fibArr.add(fibArr.get(i)+fibArr.get(i-1));
            i++;
        }
        fibArr.remove(i);
        for (int j=0;j<fibArr.size();j++){
            int proc=fibArr.get(j);
            if (proc%2==0){
                result+=proc;
            }
        }
        return result;

    }
}
