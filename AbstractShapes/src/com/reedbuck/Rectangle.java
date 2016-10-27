package com.reedbuck;

/**
 * Created by saikumar on 18/8/16 at 2:31 PM.
 */
public class Rectangle extends Shape{
    int length;
    int breadth;

    public Rectangle(int length,int breadth) {
        this.length = length;
        this.breadth=breadth;
        name="Rectangle";
        noSides=4;
    }

    @Override
    double getArea() {
        return length*breadth;
    }

    @Override
    double getPerimeter() {
        return 2*(length+breadth);
    }
}
