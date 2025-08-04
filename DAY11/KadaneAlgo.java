// package DAY11;
// import java.util.*;

// public class KadaneAlgo {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of an array: ");
//         int size = sc.nextInt();
//         int[] arr = new int[size]; 
//         System.out.print("Enter the elements of array: ");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int maxSum = Integer.MIN_VALUE;
//         int currSum = 0;
//         int prefix[] = new int[arr.length];
//         prefix[0] = arr[0];
//         // prefix array 
//         for(int i =1;i<prefix.length;i++){
//             prefix[i]=prefix[i-1] + arr[i];
//         }
//         for(int i = 0;i<arr.length;i++){
//             int start = i;
//             for(int j = i;j<arr.length;j++){
//                 int end = j;
//                 currSum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
//                 // kadane's logic
//                 if(currSum<0){ 
//                     currSum = 0;
//                 }
//                 if(maxSum<currSum){
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("MAx sum = " + maxSum);
//         sc.close();
//     }
// }




