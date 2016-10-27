package com.reedbuck;

public class Main {

    public static void main(String[] args) {
        ITelephone saiphone;
        saiphone=new DeskPhone(98855);
        saiphone.powerOn();
        saiphone.callPhone(98855);
        saiphone.answer();
        saiphone.dial(98590);

        saiphone=new MobilePhone(98590);
        saiphone.powerOn();
        saiphone.callPhone(98590);
        saiphone.answer();
        saiphone.dial(98590);

    }
}
