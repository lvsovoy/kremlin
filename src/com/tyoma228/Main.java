package com.tyoma228;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username:");
        String input = sc.next();
        if (input.equalsIgnoreCase("vadim")) {
            System.out.println("Enter password " + input);
            String parol = sc.next();
            if (parol.equals("parol")) {
                System.out.println("Kremlin is Hacked");

            } else {
                System.out.println(input +", you spy");
            }
        } else {
            System.out.println("Privet, bratishka " + input);
        }
    }
}
