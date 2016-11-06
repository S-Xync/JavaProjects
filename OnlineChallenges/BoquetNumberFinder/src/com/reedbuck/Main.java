package com.reedbuck;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        for (int i=0;i<t;i++){
            long[][] flowers=new long[3][3];
            for (int j=0;j<3;j++){
                for (int k=0;k<3;k++) {
                    flowers[j][k] = scanner.nextLong();
                }
            }
            System.out.println(numberLeafFinder(flowers));
        }
    }
    public static long numberLeafFinder(long[][] flowers){
        long[] addNums={0,0,0,0,0,0};
        for (int i=0;i<3;i++){
            addNums[0]+=flowers[0][i];
            addNums[1]+=flowers[1][i];
            addNums[2]+=flowers[2][i];
            addNums[3]+=flowers[i][0];
            addNums[4]+=flowers[i][1];
            addNums[5]+=flowers[i][2];

        }
        for (int i=0;i<addNums.length;i++){
            long x=addNums[i];
            if (x>0&&x%2==0){
                addNums[i]=x-1;
            }
        }
        long highResult=0;
        for (int i=0;i<addNums.length;i++){
            if (addNums[i]>highResult){
                highResult=addNums[i];
            }
        }
        return highResult;

    }
}
