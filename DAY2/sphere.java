package DAY2;

import java.util.*;
public class sphere{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double radius = scanner.nextDouble();
        // double pie = 3.14159;
        double circum = 2*(Math.PI*radius);
        double area = Math.PI*(Math.pow(radius,2));
        double volume = (4*Math.PI*(Math.pow(radius,3)))/3;
        System.out.println("The circumference is : " + circum + "cm");
        System.out.println("The area is : " + area + "cm²");
        System.out.println("The volume is : " + volume + "cm³");
        scanner.close();
    }
}