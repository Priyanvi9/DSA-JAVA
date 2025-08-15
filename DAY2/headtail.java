package DAY2;
import java.util.*;

public class headtail{
    public static void main(String[] args){
        Random random = new Random();
        boolean ishead = random.nextBoolean();
        if(ishead){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }
    }
}