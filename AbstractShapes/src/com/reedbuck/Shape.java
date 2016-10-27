package com.reedbuck;

/**
 * Created by saikumar on 18/8/16 at 2:08 PM.
 */
public abstract class Shape {
    protected String name;
    protected int noSides;
    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                " name = " + name +
                " , noSides = " + noSides+
                " , Perimeter = " + getPerimeter() +
                " ,Area = " + getArea()+
                " }";
    }
}
