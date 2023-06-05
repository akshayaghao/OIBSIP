import java.util.Scanner;

public class ATMSystem {
    private static String userId = "8924";
    private static String userPin = "6632";
    private static double balance = 5000.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to the SBIATM System ===");
        System.out.print("Enter your User ID: ");
        String enteredUserId = scanner.nextLine();

        System.out.print("Enter your User PIN: ");
        String enteredUserPin = scanner.nextLine();

        if (enteredUserId.equals(userId) && enteredUserPin.equals(userPin)) {
            System.out.println("Login successful!");
            showMenu(scanner);
        } else {
            System.out.println("Invalid User ID or User PIN. Exiting...");
        }

        scanner.close();
    }

    private static void showMenu(Scanner scanner) {
        while (true) {
            System.out.println();
            System.out.println("=== ***SBI ATM Menu*** ===");
            System.out.println("1. View Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Transactions History");
            System.out.println("6. Quit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    viewBalance();
                    break;
                case 2:
                    withdraw(scanner);
                    break;
                case 3:
                    deposit(scanner);
                    break;
                case 4:
                    transfer(scanner);
                    break;
                case 5:
                    viewTransactionsHistory();
                    break;
                case 6:
                    System.out.println("Thank you for using the ATM. Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void viewTransactionsHistory() {
		// TODO Auto-generated method stub
		
	}

	private static void viewBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
            System.out.println("Remaining balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    private static void deposit(Scanner scanner) {
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
            System.out.println("Updated balance: $" + balance);
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    private static void transfer(Scanner scanner) {
        System.out.print("Enter the amount to transfer: $");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        if (amount <= balance) {
            System.out.print("Enter the recipient's User ID: ");
            String recipientId = scanner.nextLine();

            // Perform transfer logic here
            // Assuming a successful transfer

            balance -= amount;
            System.out.println("Transfer of $" + amount + " to User ID " + recipientId + " successful.");
            System.out.println("Remaining balance: $" + balance);
        }
    }
}

