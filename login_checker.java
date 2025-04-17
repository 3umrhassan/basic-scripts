import java.util.Scanner;

public class login_checker {
    public static void main(String[] args) {
        String correctUsername = "user";
        String correctPassword = "1234";

        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        String username = input.nextLine();

        System.out.print("Password: ");
        String password = input.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid credentials.");
        }
    }
}
