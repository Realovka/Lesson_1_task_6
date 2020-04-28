package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите два числа");
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan1.nextInt();
        if (a > b) {
            System.out.println("Первое число больше второго");
        } else if (a < b) {
            System.out.println("Второе число больше первого");
        } else {
            System.out.println("Числа равны");
        }
    }
}