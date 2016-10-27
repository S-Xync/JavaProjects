package com.reedbuck;

/**
 * Created by saikumar on 26/10/16 at 5:44 PM.
 */
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
//        int[] resArr=new int[t];
        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            System.out.println(resultFinder(n,3,5));
        }
//        for (int i=0;i<t;i++){
//        }
    }
    public static long resultFinder(int n, int a, int b){
        long result=0;
        long aa=a;
        long bb=b;
        while (aa<n){
            result+=aa;
            aa+=a;
        }
        while (bb<n){
            if (bb%3!=0){
                result+=bb;
            }
            bb+=b;
        }
        return result;
    }
}
