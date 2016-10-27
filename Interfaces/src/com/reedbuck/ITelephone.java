package com.reedbuck;

/**
 * Created by saikumar on 6/8/16 at 8:37 PM.
 */
public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
