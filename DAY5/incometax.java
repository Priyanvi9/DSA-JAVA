// package DAY5;

// import java.util.Scanner;

// public class incometax {
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter your income : ");
//         float income = scanner.nextFloat();
//         float tax;
//         float intax;
//         if(income<500000){
//             System.out.print("There is no income tax on " +(int) (income) + " less than 5lakhs.");
//         }
//         else if(income>=500000 && income<1000000){
//             tax = (int)(income *0.2);
//             System.out.print("Your income tax will be " + tax);
//         }
//         else if(income>=1000000){
//             tax = (int)(income*0.3);
//             System.out.print("Your income tax will be " + tax);
//         }
//         else{
//             System.err.println("Invalid data.");
//         }
//         scanner.close();
//     }
// }
