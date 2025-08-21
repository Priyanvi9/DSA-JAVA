package DAY10;
import java.util.*;
public class array_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int marks[] = new int[n];
        System.out.print("Enter marks in Physics : ");
        marks[0] = sc.nextInt();
        System.out.print("Enter marks in Chemistry : ");
        marks[1] = sc.nextInt();
        System.out.print("Enter marks in Maths : ");
        marks[2] = sc.nextInt();
        System.out.println("My Physics marks : " + marks[0]);
        System.out.println("My Chemistry marks : " + marks[1]);
        System.out.println("My Maths marks : " + marks[2]);
        System.out.println("The length of the array is : " + marks.length);
        sc.close();
    }
}




//////////////////


















































