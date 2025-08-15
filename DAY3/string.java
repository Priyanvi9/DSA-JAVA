package DAY3;

import java.util.*;

public class string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email, domain, username;
        System.out.print("Enter your email-id : ");
        email = scanner.nextLine();
        if (email.contains("@")) {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);
            System.out.println("Your email id is : " + email);
            System.out.println("Username : " + username);
            System.out.println("Domain is : " + domain);
        } else {
            System.out.println("Enter must contain @.");
        }
        scanner.close();
    }
}
