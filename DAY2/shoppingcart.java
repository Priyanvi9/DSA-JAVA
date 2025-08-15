package DAY2;

import java.util.*;

public class shoppingcart{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What item would you like to buy?: ");
        String item = scanner.next();
        System.out.print("What is the price for each?: ");
        float price = scanner.nextFloat();
        System.out.print("How many would you like?: ");
        int no = scanner.nextInt();
        float total = price*no;
        char currency = '$';
        System.out.println("You have bought " + no + " " + item);
        System.out.println("Your total is " + currency + total);
        scanner.close();
    }
}