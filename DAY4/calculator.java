package DAY4;
import java.util.*;;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter num2 : ");
        double num2 = sc.nextDouble();
        System.out.print("Enter operation(+,-,*,/,%) : ");
        // next() - take string as input but charAt(index) allow us to take only charachter input.
        char operator = sc.next().charAt(0); 
        switch(operator){
            case '+' ->
                System.out.println(num1+num2);
            case '-' ->
                System.out.println(num1-num2);
            case '*' ->
                System.out.println(num1*num2);
            case '/' ->{
                if(num2==0){
                    System.out.print("Cannot divide by zero!");
                }
                else{
                System.out.println(num1/num2);
                }
            }
            case '%' ->
                System.out.println(num1%num2);
            default ->
                System.out.println("Please enter the operator (+,-,*,/,%) only");
        }
        sc.close();
    }
}
