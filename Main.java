/**
 * @author Jared St.Louis
 * @version 1.0 July 23, 2023
 */

// Imports
import java.util.Scanner;
import java.util.HashMap;

/**
 * Main class to interact with the user and manage user profiles.
 */
public class Main {
    public static void main(String[] args) {

        // Create a HashMap to store user profiles with username as the key
        HashMap<String, Profile> users = new HashMap<String, Profile>();

        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input

        // Continue until the user decides to quit
        while (true) {

            System.out.println("Welcome to Lab07 ");

            System.out.print("Enter user first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter user last name: ");
            String lastName = scanner.nextLine();

            System.out.println("Your username is: " + firstName + lastName);

            System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
            String dateOfBirth = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            // Create a new Profile object and set its attributes
            Profile userProfile = new Profile();
            userProfile.setFirstName(firstName);
            userProfile.setLastName(lastName);
            userProfile.setUserName(firstName + lastName);
            userProfile.setDateOfBirth(dateOfBirth);
            userProfile.setProfilePassword(password);

            // Add the new user profile to the HashMap using username as the key
            users.put(userProfile.getUserName(), userProfile);

            System.out.print("\nUser registered! \nEnter Q to quit the app!: ");
            String exit = scanner.nextLine();

            // If the user enters "q" or "Q", exit the loop and quit the app
            if (exit.equals("q") || exit.equals("Q")) {
                break;
            }
        }

        // After the user registration process, display all user profiles
        System.out.println();
        for (HashMap.Entry<String, Profile> entry : users.entrySet()) {
            // Retrieve the 'Profile' object (user profile) associated with the current entry.
            // 'entry.getValue()' returns the value (Profile object) corresponding to the current key (username) in the loop.
            Profile profile = entry.getValue();
            profile.printProfile(); // Call the printProfile method to display the profile details
            System.out.println();
        }

        System.out.println("Proceeding to user login");
        System.out.print("Enter Username: ");
        String userLogin = scanner.nextLine();

        // Retrieve the user profile associated with the entered username from the HashMap.
        Profile loginProfile = users.get(userLogin);
        if (loginProfile == null) {
            System.out.println("Username doesn't exist!");
            System.exit(0); // Exit the program if the username is not found.
        }

        int userAttempts = 0; // counter variable to keep track of login attempts.

        while (userAttempts < 3) {
            System.out.print("Enter Password: ");
            String loginPassword = scanner.nextLine();

            // Check if the entered password matches the password stored in 'loginProfile'.
            if (loginProfile.checkPassword(loginPassword)) {
                System.out.println("\nUser logged in!\n");
                loginProfile.printProfile();
                break;
            } else {
                userAttempts++;
                if (userAttempts < 3) {
                    System.out.println("Incorrect password, you have " + (3 - userAttempts) + " attempts remaining!");
                } else {
                    System.out.println("Max number of wrong attempts reached!");
                }
            }
        }
    }
}