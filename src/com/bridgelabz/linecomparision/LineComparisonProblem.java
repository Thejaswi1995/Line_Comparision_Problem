package com.bridgelabz.linecomparision;

import java.util.Scanner;

public class LineComparisonProblem {
    static double length1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first co-ordinator:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter the second co-ordinator:");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        length1 = Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
        System.out.println("The length of first line is :" +length1);

    }
}
