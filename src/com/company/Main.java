/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Makiya Thomas
 */
package com.company;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the length of the ceiling in feet? ");
        int length = input.nextInt();

        System.out.print("What is the width of the ceiling in feet? ");
        int width = input.nextInt();

        int area = length * width;
        int gallons = 0;
        for (int i = 0; area > 0; i++) {
            area = -350;
            gallons++;
        }


        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet", gallons, area);
    }
}