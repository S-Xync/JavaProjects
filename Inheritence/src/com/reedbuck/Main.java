package com.reedbuck;

public class Main {

    public static void main(String[] args) {
	/*Animal animal=new Animal("Animal",1,1,5,5);
        Dog dog=new Dog("Yorkie",8,20,2,4,1,20,"Long and Silky");
        dog.eat();
        System.out.println("**************");
        dog.walk();
        System.out.println("**************");
        dog.run();
        System.out.println("**************");*/
        Outlander outlander=new Outlander(36);

        outlander.accelerate(30);
        outlander.steer(45);
        outlander.accelerate(-10);
        outlander.accelerate(30);
        outlander.accelerate(-42);

    }
}
