package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter integer to analyse, 0 to exit");
        int num = in.nextInt();

        while (num != 0) {
            NumberCheck numCheck = new NumberCheck(num);

            System.out.println("Input: " + num);
            System.out.println("Is prime number: " + numCheck.isPrime());
            System.out.println("Is fibonacci number: " + numCheck.isFibonacci());
            System.out.println("Is triangular number: " + numCheck.isTriangular());
            System.out.println("Is square number: " + numCheck.isSquare());

            System.out.println("Enter integer to analyse, 0 to exit");
            num = in.nextInt();
        }
    }
}
