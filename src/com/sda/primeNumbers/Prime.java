package com.sda.primeNumbers;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Please insert number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        PrimeSelector primeSelector = new PrimeSelector();
        System.out.println(primeSelector.isPrime(number));
        scanner.close();
    }
}
