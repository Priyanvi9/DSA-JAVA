package DAY8;

import java.util.Scanner;
public class prime_or_not {
    public static boolean isprime(int n){
        if(n==2) {
            return true;
        }
        boolean isprime = true;
        for(int i = 2;i<=n-1;i++){
            if(n%i==0){
                isprime= false;
                break;
            }
        } 
        return isprime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println(isprime(m));
        sc.close();
    }
}
