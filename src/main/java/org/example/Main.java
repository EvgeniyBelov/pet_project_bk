package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение b: ");
        int b = scanner.nextInt();

        System.out.print("Введите значение h: ");
        int h = scanner.nextInt();

        countAreaOfParallelogram(b, h);
    }

    // Do not change code below
    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}