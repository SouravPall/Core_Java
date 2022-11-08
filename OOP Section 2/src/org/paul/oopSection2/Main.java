package org.paul.oopSection2;

public class Main {
    public static void main(String[] args) {

        Bird phoenix = new Bird("Nina","Golden",2,true,2);
        System.out.println("Bird Name:"+ phoenix.getName());
        phoenix.eat("Seeds");

        System.out.println("Wings: "+ phoenix.getWings());

        Dog germanShepherd = new Dog("Tommy","Brown",4,true);
        System.out.println(germanShepherd.getName());
        germanShepherd.eat("Meat");
    }
}
