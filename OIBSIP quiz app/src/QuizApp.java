import java.util.Scanner;

public class QuizApp {
    private static String username;
    private static String password;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Login
        login(scanner);

        // Update Profile and Password
        updateProfileAndPassword(scanner);

        // Selecting answers for MCQs
        selectAnswersForMCQs(scanner);

        // Timer and auto submit
        timerAndAutoSubmit(scanner);

        // Closing session and Logout
        logout(scanner);

        scanner.close();
    }

    private static void login(Scanner scanner) {
        System.out.println("=== Login ===");
        System.out.print("Enter your username: ");
        username = scanner.nextLine();
        System.out.print("Enter your password: ");
        password = scanner.nextLine();
        System.out.println("Logged in successfully!");
    }

    private static void updateProfileAndPassword(Scanner scanner) {
        System.out.println("=== Update Profile and Password ===");
        System.out.print("Enter your new username: ");
        username = scanner.nextLine();
        System.out.print("Enter your new password: ");
        password = scanner.nextLine();
        System.out.println("Profile and password updated successfully!");
    }

    private static void selectAnswersForMCQs(Scanner scanner) {
        System.out.println("=== Select Answers for MCQs ===");
        System.out.println("Question 1: Which country gifted the 'Statue of Liberty' to USA in 1886?");
        System.out.println("A. France");
        System.out.println("B. Canada");
        System.out.println("C. Brazil");
        System.out.println("D. England");
        System.out.print("Enter your answer (A, B, C, or D): ");
        String answer = scanner.nextLine();
        System.out.println("Answer selected: " + answer);
    }

    private static void timerAndAutoSubmit(Scanner scanner) {
        System.out.println("=== Timer and Auto Submit ===");
        System.out.print("Enter the duration of the quiz (in minutes): ");
        int duration = scanner.nextInt();
        System.out.println("Starting the timer for " + duration + " minutes...");
        // Logic for timer and auto-submit goes here
        System.out.println("Time's up! Submitting the quiz automatically.");
    }

    private static void logout(Scanner scanner) {
        System.out.println("=== Closing Session and Logout ===");
        System.out.println("Closing the session and logging out...");
        // Logic for closing the session and logout goes here
        System.out.println("Logged out successfully!");
    }
}
