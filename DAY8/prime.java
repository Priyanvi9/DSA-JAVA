package DAY8;
import java.util.*;
public class prime{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print("This is not prime.");
                break;
            }
            else{
                System.out.print("This is prime.");
                break;
            }
        }
        scanner.close();
    }
}
