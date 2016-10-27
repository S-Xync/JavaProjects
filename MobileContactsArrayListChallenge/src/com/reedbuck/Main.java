package com.reedbuck;

import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    private static MobilePhone mobilePhone=new MobilePhone("9885500410");
    public static void main(String[] args) {
        boolean quit=false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\nChoose an action (7 to show Available Actions) : ");
            int action=scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 1:
                    System.out.println("Shutting Down your Mobile Phone....");
                    quit=true;
                    break;
                case 2:
                    mobilePhone.printContacts();
                    break;
                case 3:
                    addNewContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    removeContact();
                    break;
                case 6:
                    queryContact();
                    break;
                case 7:
                    printActions();
                    break;
            }
        }
    }
    private static void addNewContact(){
        System.out.println("Enter Name of New Contact : ");
        String name=scanner.nextLine();
        System.out.println("Enter Phone Number of New Contact : ");
        String phone=scanner.nextLine();
        Contact newContact=Contact.createContact(name,phone);
        if (mobilePhone.addNewContact(newContact)){
            System.out.println("New contact\nName : "+name+"\nPhone Number : "+phone+"\nCreated");
        }
        else {
            System.out.println(name+" already exists on Phone.");
        }
    }
    private static void updateContact(){
        System.out.println("Enter existing contact name : ");
        String name=scanner.nextLine();
        Contact existingContactRecord=mobilePhone.queryContact(name);
        if (existingContactRecord==null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name : ");
        String newName=scanner.nextLine();
        System.out.println("Enter new phone number : ");
        String newPhone=scanner.nextLine();
        Contact newContact=Contact.createContact(newName,newPhone);
        if (mobilePhone.updateContact(existingContactRecord,newContact)){
            System.out.println("Contact updated successfully");
        }
        else {
            System.out.println("Error updating contact");
        }
    }
    private static void removeContact() {
        System.out.println("Enter existing contact name : ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Contact successfully deleted");
        }
        else {
            System.out.println("Error deleting contact");
        }
    }
    private static void queryContact() {
        System.out.println("Enter existing contact name : ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name : "+existingContactRecord.getName()+"\nPhone Number : "+existingContactRecord.getPhoneNumber());
    }
    private static void startPhone(){
        System.out.println("Starting phone.....");
    }
    private static void printActions(){
        System.out.println("\nAvailable actions:\n\n");
        System.out.println(
                "-> 1 -- Shut Down\n"+
                "-> 2 -- Print Contacts\n"+
                "-> 3 -- Add a New Contact\n"+
                "-> 4 -- Update an Existing Contact\n"+
                "-> 5 -- Remove an Existing Contact\n"+
                "-> 6 -- Query if a Contact Exists\n"+
                "-> 7 -- Available Actions\n");
        System.out.println("\nChoose your Action : ");
    }

}
