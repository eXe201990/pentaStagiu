package com.company;

public class Fibonnaci {
    public static void main(String[] args) {
    fibonnaci(20);
    }

    private static void fibonnaci(int nr){
        int i = 1;
        int prev = 0;
        int next;
        int sum = 1;
        float average;
        int range = nr;

        if( nr == 1){
            System.out.println(i);
            System.exit(0);
        }

        if( nr == 0){
            System.exit(0);
        }

        System.out.println(i);

        while (range > 1){
            System.out.println(" ");
            next = i + prev;
            sum += next;
            prev = i;
            i = next;
            System.out.println(next);
            range--;
        }

        average = sum / (float) nr;
        System.out.println();
        System.out.println(average);
    }
}
