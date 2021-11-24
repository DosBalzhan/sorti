package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n , m=0;
        System.out.println("san zhaz");
        n=scanner.nextInt();
        while (n > 0) {
             m = n % 10;
            n = n / 10;
        }
        System.out.println(m);
    }
}






