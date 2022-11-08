package org.paul.operators;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;


//        boolean answer = a != b;
//        System.out.println(answer);
//
////        a = a+2;
//
////        a += 2; (same as a++ increase 2)
//
////        a++;
//
//        System.out.println(a);
//
//        boolean ans = a==5 || b==3;
//        System.out.println(ans);


           boolean ans = a >3;
//        if (ans){
//            System.out.println("A is greater than 3");
//        } else {
//            System.out.println("A is less than 3");
//        }

        switch (a){
            case 1:
                System.out.println("A is One");
                break;
            case 2:
                System.out.println("A is Two");
                break;
            case 3:
                System.out.println("A is Three");
            default:
                System.out.println("A is not One, two or three");
                break;
        }

        System.out.println("Continue.....");

    }
}
