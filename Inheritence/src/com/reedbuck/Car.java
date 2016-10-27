package com.reedbuck;

/**
 * Created by PERSONAL on 7/3/2016.
 */
public class Car extends Vehicle{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currenGear) {
        this.currentGear = currenGear;
        System.out.println("Car.changeGear():  Changed to gear "+this.currentGear);
    }
    public void changeVelocity(int speed, int direction){
        move(speed,direction);
        System.out.println("Car.changeVelocity(): Velocity: "+speed+" Direction: "+direction);
    }
}
