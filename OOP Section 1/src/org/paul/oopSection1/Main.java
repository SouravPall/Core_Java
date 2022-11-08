package org.paul.oopSection1;

public class Main {
    public static void main(String[] args) {

        Phone iPhone = new Phone("iPhone 11",5, 8,8);
        iPhone.setName("iPhone 11");
        System.out.println(iPhone.getName());

        iPhone.setMemoryRam(8);

        iPhone.playMusic("Our Wings are Burning");
        iPhone.playMusic("Lamenting kiss");

        Phone pixel = new Phone("Pixel 3", 16);

    }
}
