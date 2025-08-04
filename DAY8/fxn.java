// methods/functions - two types 
// inbuild method(math header file - pow,sqrt,min,max etc)
// user defined - that we make for our convenience

// Function overloading - multiple functions with the SAME NAME but DIFFERENT PARAMETERS - depends only on parameters not on return type
// int mul(int a, int b, int c) return a*b*c       float mul(int a, int b, int c) return a*b*c - not exists function overloading
package DAY8;
import java.util.*;
public class fxn {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b , int c ){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("The sum is : " + sum(num1, num2));
        System.out.println("The sum is : " + sum(num1, num2, num3));
        sc.close();
    }
}

