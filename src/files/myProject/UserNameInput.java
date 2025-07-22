package files.myProject;

import java.util.Scanner;

class Username{
    public void readUsername(String name){
        System.out.println(name);
    }
}
public class UserNameInput {
    public static void main(String[] args) {
        Scanner scanUsername =  new Scanner(System.in);
        Username newUser = new Username();
        System.out.println("Enter your username: ");
        String name = scanUsername.nextLine();
        newUser.readUsername(name.toUpperCase());

    }

}
