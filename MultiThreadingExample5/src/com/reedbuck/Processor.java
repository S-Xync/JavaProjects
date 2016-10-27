package com.reedbuck;

/**
 * Created by saikumar on 3/9/16 at 11:22 PM.
 */
public class Processor implements Runnable{
    private int id;

    public Processor(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Starting : "+id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Ending : "+id);
    }
}
