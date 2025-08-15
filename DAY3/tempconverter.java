package DAY3;

import java.util.*;

public class tempconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------- Temperature Converter Program --------------");
        double temp;
        String choice;
        System.out.print("Convert to Celsius or Fahrenheit? (C/F) : ");
        choice = scanner.next();
        double ctemp;
        if (choice.contains("c") || choice.contains("C")) {
            System.out.print("Enter the temperature(in Fahrenheit) : ");
            temp = scanner.nextDouble();
            ctemp = (temp - 32) * 5 / 9;
            System.out.printf( "%.2f°C",ctemp);

        } else if (choice.contains("f") || choice.contains("F")) {
            System.out.print("Enter the temperature(in Celsius) : ");
            temp = scanner.nextDouble();
            ctemp = (temp * 5/9) + 32;
            System.out.printf("%.2f°F",ctemp);

        } else {
            System.out.println("Enter valid choice.");
        }
        scanner.close();
    }
}