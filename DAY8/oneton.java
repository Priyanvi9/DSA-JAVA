package DAY8;
import java.util.*;
public class oneton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
        int c = 1;
        while(c<=n){
            System.out.print(c);
            System.out.print(" ");
            c++;
        }
        scanner.close();
    }
    
}
