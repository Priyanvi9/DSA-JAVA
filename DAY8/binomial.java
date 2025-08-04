package DAY8;
import java.util.*;
public class binomial {
    public static int factor(int b){
        int f = 1;
        for(int i = 1;i<=b;i++){
           f=  f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Enter a number : ");
        int r = sc.nextInt();
        int binomial_coefficient = factor(n)/(factor(r)*factor(n-r));
        System.out.println("The binomial coefficient of " + n + " is " + binomial_coefficient);
        sc.close();
    }
}




