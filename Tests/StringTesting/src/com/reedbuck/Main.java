package com.reedbuck;

public class Main {

    public static void main(String[] args) {
	    StringBuffer s=new StringBuffer("abcdefg");
        System.out.println(s);
        String s1=s.substring(1,3);
        System.out.println(s);
        System.out.println(s1);
        s.delete(1,3);
        System.out.println(s);
        s1=s1.concat(String.valueOf(s));
        System.out.println(s1);
//        char[] cha={'a','b','c','d'};
//        String s=new String(cha);
//        System.out.println(s);
    }
}
