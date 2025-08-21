package DAY8;
import java.util.*;
public class sumtilln{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
        int i = 1,sum=0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("The sum of natural numbers till n is : " + sum);
        scanner.close();
    }
    
}
