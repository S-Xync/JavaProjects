package com.reedbuck;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by saikumar on 24/7/16 at 1:05 PM.
 */
public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit= new LinkedList<>();
        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Canberra");
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);
        addInOrder(placesToVisit,"Alice Springs");
        printList(placesToVisit);
        addInOrder(placesToVisit,"Darwin");
        printList(placesToVisit);
        visit(placesToVisit);
    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i=linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting "+i.next());
        }
        System.out.println("=======================");
    }
    private static boolean addInOrder(LinkedList<String> linkedList,String newCity){
        ListIterator<String> stringListIterator=linkedList.listIterator();
        while (stringListIterator.hasNext()){
            int comparison=stringListIterator.next().compareTo(newCity);
            if (comparison==0){
                //equal, do not add
                System.out.println(newCity+" is already added");
                return false;
            }
            else if (comparison>0){
                //new City should appear before this one
                //before brisbane, Adelaide should appear
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if (comparison<0){
                //move on to next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
    private static void visit(LinkedList cities){
        Scanner scanner=new Scanner(System.in);
        boolean quit=false;
        boolean goingForward=true;
        ListIterator<String> listIterator=cities.listIterator();
        if (cities.isEmpty()){
            System.out.println("No cities in the itenerary");
        }
        else {
            System.out.println("Now visiting "+listIterator.next());
            printMenu();
        }
        while (!quit){
            int action=scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday (vacation) over");
                    quit=true;
                    break;
                case 1:
                    if (!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward=true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now visiting "+listIterator.next());
                    }else{
                        System.out.println("Reached to the end of the list");
                    }
                    break;
                case 2:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward=false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now visiting "+listIterator.previous());
                    }
                    else {
                        System.out.println("We are at the start of the list");
                    }
                    break;
                case 3:
                    printMenu();
            }
        }

    }
    private static void printMenu(){
        System.out.println("Available actions : \n");
        System.out.println(
                "0 --> Quit\n" +
                        "1 --> go to next city\n" +
                        "2 --> go to previous city\n" +
                        "3 --> print this menu again\n"



        );
    }









}
