package DAY6.pattern;
import java.util.*;
public class hollow_circle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n_lines = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int m_lines = sc.nextInt();
        for(int i = 1;i<=n_lines;i++){
            for(int j = 1;j<=m_lines;j++){
                if(((i+j)==n_lines+1) || (i==j)){
                System.out.print("  ");
                }
                else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
        sc.close();
    }    
}






//////////////////////////////////