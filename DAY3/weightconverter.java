package DAY3;

import java.util.*;

public class weightconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------- Weight Converter Program ----------------");
        double weight, convertedweight;
        int choice;
        System.out.println("1.Convert lbs to kgs");
        System.out.println("2.Convert kgs to lbs");
        System.out.print("Enter choice(1/2) : ");
        choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Enter your weight(in lbs) : ");
            weight = scanner.nextDouble();
            convertedweight = weight*0.453592;
            System.out.printf("Your weight in kgs is : %.2f" , convertedweight);
        } else if (choice == 2) {
            System.out.print("Enter your weight(in kgs) : ");
            weight = scanner.nextDouble();
            convertedweight = weight * 2.20462;
            System.out.printf("Your weight in lbs is : %.2f" , convertedweight);
        } else {
            System.out.print("Enter the valid choice");
        }
        scanner.close();
    }
}