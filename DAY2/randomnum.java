package DAY2;
import java.util.*;

public class randomnum{
    public static void main(String[] args){
        Random random = new Random();
        int number = random.nextInt(1,101);
        System.out.println(number);
    }
}