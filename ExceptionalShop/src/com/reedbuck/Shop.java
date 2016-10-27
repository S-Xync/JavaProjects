package com.reedbuck;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
        public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Items> ItemsInShop = new ArrayList<>();
        ItemsInShop.add(new Items(1,"TV",10000,3,2));
        ItemsInShop.add(new Items(2,"Mouse",1000,7,3));
        ItemsInShop.add(new Items(3,"HeadPhone",2000,1,6));
        ItemsInShop.add(new Items(4,"Mobile",1000,5,1));
        User sai=new User("Sai",20000);
        printOptions();
        int input;
        while(true){
            System.out.println("Please Enter an option (3 to print options) : \n");
            input=scanner.nextInt();
            switch (input){
                case 1:
                    displayItems(ItemsInShop);
                    break;
                case 2:
                    System.out.println("Please Enter the Item Code of the Item : ");
                    int codeBuyItem=scanner.nextInt();
                    buyItem(codeBuyItem,ItemsInShop,sai.getBudget());
                    break;
                case 3:
                    printOptions();
                    break;
                case 4:
                    System.out.println("Thank you for shopping with us");
                    return;

            }

        }
    }
    public static void printOptions(){
        System.out.println(
                "\n1-->Display Items\n"+
                "2-->Buy Item\n"+
                "3-->Display Available Options\n"+
                "4-->Exit\n");
    }
    public static void displayItems(ArrayList<Items> items){
        for(Items item:items){
            System.out.println(item+"\n");
        }
    }
    public static void buyItem(int itemCode,ArrayList<Items> items,double budget){
        int processingToken=-1;
        Items processingItem;
        for (int i=0;i<items.size();i++){
            if (items.get(i).getItemCode()==itemCode){
                processingToken=i;
                break;
            }
        }
        try{
            if (processingToken<0){
                throw new ItemNotFound();
            }
            processingItem=items.get(processingToken);
            System.out.println("Please Enter the quantity of "+processingItem.getItemName()+" : ");
            int quan=scanner.nextInt();
            if (quan>processingItem.getStockRemaining()){
                throw new OutOfStock();
            }
            if (quan>processingItem.getItemLimit()){
                throw new ItemLimit();
            }
            if (quan*processingItem.getUnitPrice()>budget){
                throw new OverBudget();
            }
            int x=processingItem.getStockRemaining()-quan;
            processingItem.setStockRemaining(x);
            System.out.println("You bought "+quan+" "+processingItem.getItemName()+"(s)");

        }catch(ItemNotFound e){
            System.out.println(e);
            System.out.println("Please verify your details\n");
        }
        catch (ItemLimit e) {
            System.out.println(e);
            System.out.println("Please verify your details\n");
        }catch (OverBudget e){
            System.out.println(e);
            System.out.println("Please verify your details\n");
        }catch (OutOfStock e){
            System.out.println(e);
            System.out.println("Please verify your details\n");
        }/*finally{
            System.out.println("Please verify your details");
        }*/
    }

}

