package DAY10;
import java.util.*;

public class largest {
    public static int largestNumber(int arr[], int l){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>l){
                l = arr[i];
            }
        }
         return l;
    }
    public static void main(String[] args) {
        int lg = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements of an array : ");
        for(int i = 0;i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Here is your array : ");
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        int result = largestNumber(arr,lg);
        System.out.println("The largest element of the array is : " + result);

        sc.close();
    }
}
