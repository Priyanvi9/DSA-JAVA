package DAY5;

import java.util.*;

public class logicalop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.print("Enter the final limit : ");
        int n = scanner.nextInt();
        Random random = new Random();
        for (int i = 0; i <= n; i++) {
            int number = random.nextInt(1, 21);
            System.out.print(" ");
            System.out.print(number);
        }

        scanner.close();

    }
}