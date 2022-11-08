package org.paul.arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Contact application on the phone

        String [] names = {"Eren", "Meliodas","Izuku","Sitama","Brian"};
        int[] numbers = {1721356,16885468,875369,56987526,88021475};

        for (int i = 0; i<names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("Please Enter a name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        for (int i = 0; i<names.length; i++){
            if (name.equals(names[i])) {
                System.out.println(numbers[i]);
            }
        }


    }
}
