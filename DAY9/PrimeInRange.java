
import java.util.*;
public class PrimeInRange {
    public static boolean isprime(int n) {
        if (n == 2) {
            return true;
        }
        boolean isprime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }
        return isprime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n to find primes from 2 to n: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}







