package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserProfile {

    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Choose you favorite Genre: \n"
                + "1.Comedy, 2.Drama, 3.Action, 4.Mystery");
        String genre = sc.nextLine(); 
        
        UserProfile user = new UserProfile(name, genre);
        System.out.println("User profile has been created");

    }

}
