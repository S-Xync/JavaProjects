package com.reedbuck;

/**
 * Created by saikumar on 18/8/16 at 2:17 PM.
 */
public class Circle extends Shape{
    protected int radius;

    public Circle(int radius) {
        this.radius = radius;
        name="Circle";
        noSides=0;
    }

    @Override
    double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    double getPerimeter() {
        return 2*3.14*radius;
    }
}
