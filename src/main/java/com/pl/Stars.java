package com.pl;

public class Stars {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 20; j++){
                if (i == 1 || i == 8){
                    System.out.print(" ");
                }else if (i == 2){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
