package com.reedbuck;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        sentence = sentence.toUpperCase();
        sentence = sentence.replaceAll("[^A-Z]", "");

        char[] chars = sentence.toCharArray();

        Set<Character> set = new HashSet<Character>();

        for( int i = 0; i < chars.length; i++ ) set.add(chars[i]);

        System.out.println(set.size() == 26 ? "pangram" : "not pangram");

    }
}