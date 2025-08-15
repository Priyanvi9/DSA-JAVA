package DAY2;

import java.util.*;

public class hypotenuse{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base(B) : ");
        int base = scanner.nextInt();
        System.out.print("Enter perpendicular(P) : ");
        int perpen = scanner.nextInt();
        double hy = (base*base) + (perpen*perpen);
        double h = Math.sqrt(hy);
        System.out.print("The hypotenuse (H² = P² + B²): " + h);
        scanner.close();
    }
}