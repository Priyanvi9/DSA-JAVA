package DAY2;

import java.util.*;

public class compoundinterest{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount : ");
        double p = scanner.nextDouble();
        System.out.print("Enter the interest rate (in %) : ");
        double r = scanner.nextDouble() / 100;
        System.out.print("Enter the # in years : ");
        int t = scanner.nextInt();
        System.out.print("Enter the # of times compounded per year : ");
        int n = scanner.nextInt();
        double result_1 = (1 + r/n);
        int power = n*t;
        double result_2 = Math.pow(result_1,power);
        double amount = p*result_2;
        double amounts = p *Math.pow(1+r/n, n*t);
        System.out.println("The amount after " + t + " years is : " + "$" + amounts);
        System.out.print("The amount after " + t + " years is : " + "$" + amount);

        scanner.close();
    }
}