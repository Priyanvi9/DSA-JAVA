// // call by value - the whole changes to the formal parameters keep only in function that's why in function swapping done but in main function it didn't
// // java always calls by value always
// package DAY7;
// import java.util.*;

// public class swap {
//     public static void swapOf(int num1, int num2) {
//         int temp;
//         temp = num1;
//         num1 = num2;
//         num2 = temp;
//         System.out.println("Inside swap method: num1 = " + num1 + " num2 = " + num2);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter another number: ");
//         int p = sc.nextInt();

//         System.out.println("Before swapping: num1 = " + a + " num2 = " + p);

//         swapOf(a, p);

//         System.out.println("After swapping (outside swap method): num1 = " + a + " num2 = " + p);

//         sc.close();
//     }
// }
