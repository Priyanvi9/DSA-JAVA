package DAY5;
// &&
// || 
// !

import java.util.*;
public class username {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username : ");
        String username = scanner.nextLine();
        if(username.contains(" ") || username.contains("_")){
            System.out.println("Username is having spaces or underscores");
            System.out.println("Try again.");
        }
        else if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be in between 4-12 charachters.");
        }
        else{
            System.out.println("Hello " + username);
        }
        
        scanner.close();
    }
}
