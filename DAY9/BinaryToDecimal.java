
// package DAY9;
// import java.util.*;

// public class BinaryToDecimal{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number(Binary form) : ");
//         int n = sc.nextInt();
//         int ans = 0;
//         for(int i = 0;n>0;i++){
//             int ld = n%10;
//              ans = ans + ld*(1 << i); // 1<<i is left shifting of bits - multiplying a with 2^b
//              n=n/10;
//         }
//         System.out.println(ans);
//         sc.close();
//     }
// }
