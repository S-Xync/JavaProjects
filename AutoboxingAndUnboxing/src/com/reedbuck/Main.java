package com.reedbuck;

import java.util.ArrayList;

public class Main {
    class intClass{
        private int myValue;

        public intClass(int myValue) {
            this.myValue = myValue;
        }

        public int getMyValue() {
            return myValue;
        }

        public void setMyValue(int myValue) {
            this.myValue = myValue;
        }
    }

    public static void main(String[] args) {
        ArrayList<String> strArrayList=new ArrayList<String>();
        //ArrayList<int> intArrayList=new ArrayList<int>();
        ArrayList<intClass> intClassArrayList=new ArrayList<intClass>();
        Integer integer=new Integer(54);
        Double doubleValue=new Double(2.54);

        ArrayList<Integer> integerArrayList=new ArrayList<Integer>();
        for (int i=0;i<=10;i++){
            integerArrayList.add(Integer.valueOf(i));
        }
        for (int i=0;i<integerArrayList.size();i++){
            System.out.println(i+" --> "+integerArrayList.get(i).intValue());
        }
        Integer myIntValue=56;//Integer.valueOf(56);
        int myInt=myIntValue;//myIntValue.intValue();
        System.out.println("");
        ArrayList<Double> doubleArrayList=new ArrayList<Double>();
        for (double dbl=0.0;dbl<=10.0;dbl+=0.5){
            doubleArrayList.add(dbl);
        }
        for (int i=0;i<doubleArrayList.size();i++){
            System.out.println(i+" --> "+doubleArrayList.get(i));
        }
    }
}
