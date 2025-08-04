// package DAY4;
// import java.util.*;;
// public class calculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter num1 : ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter num2 : ");
//         int num2 = sc.nextInt();
//         System.out.print("Enter operation(+,-,*,/,%) : ");
//         // next() - take string as input but charAt(index) allow us to take only charachter input.
//         char operator = sc.next().charAt(0); 
//         switch(operator){
//             case '+':
//                 System.out.println(num1+num2);
//                 break;
//             case '-':
//                 System.out.println(num1-num2);
//                 break;
//             case '*':
//                 System.out.println(num1*num2);
//                 break; 
//             case '/':
//                 System.out.println(num1/num2);
//                 break; 
//             case '%':
//                 System.out.println(num1%num2);
//                 break;
//             default:
//                 System.out.println("Please enter the operator (+,-,*,/,%) only");
//         }
//         sc.close();
//     }
// }
