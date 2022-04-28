package com.bridgelabz.linecomparision;

import java.util.Scanner;

public class LineComparisonProblem {
    static double length1;
    static double length2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first co-ordinator:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter the second co-ordinator:");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("Enter the third co-ordinator:");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        System.out.println("Enter the fourth co-ordinator:");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        length1 = Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
        System.out.println("The length of first line is :" +length1);
        length2 = Math.sqrt(Math.pow((x4-x3),2)+ Math.pow((y4-y3),2));
        System.out.println("The length of second line is :" +length2);

        if(length1 == length2)
        System.out.println("Lines are equal");
        else
            System.out.println("Lines are not equal");


    }
}
