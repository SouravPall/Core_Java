package org.paul.simpleArrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String [] students = new String[5];
        students[1] = "Sourav";
        students[0] = "Zero Hero";
        students[2] = "Eren";
        students[3] = "Satoru";
        students[4] = "Deni";
        students[5] = "Denji";

        System.out.println(Arrays.toString(students));
        System.out.println(students[5]);

        String [] employees = {"Melodious", "Tom", "King"};
        int [] numbers = { 1, 2, 3, 4, 5, 6};
        for (int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
