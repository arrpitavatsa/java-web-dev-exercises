package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
//test
public class Area {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of circle :");
        double radius = -1;
        while(!input.hasNextDouble() || (radius = input.nextDouble()) <0){
            System.out.println("Please enter a positive number");
            input.nextLine();
        }
        System.out.println("The area of circle is :" +Circle.getArea(radius) );

    }
}
