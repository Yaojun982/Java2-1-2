package com.tw;


import java.util.Random;
import java.util.Scanner;

public class Guess1To100 {
    public static void main(String[] args) {
        Random random = new Random();
        int guessnumber = random.nextInt(100) + 1;
        int start = 1;
        int end = 100;
        System.out.println(guessnumber);

        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("please enter a num:");
            int number = scanner.nextInt();
            System.out.println("USER:" + number);
            if (number > guessnumber) {
                if (end > number)
                    end = number;
                {
                    System.out.println("Smaller" + start + "~" + end);
                }
            } else if (number < guessnumber) {
                if (start < number)
                    start = number;
                {
                    System.out.println("Bigger" + start + "~" + end);
                }
            }else if (number==guessnumber){
                System.out.println("yes");
                break;
            }
        }System.out.println("87940");
    }
}