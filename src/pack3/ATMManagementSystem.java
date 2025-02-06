package pack3;
import java.util.Scanner;

public class ATMManagementSystem 
{
	private double balance; // Stores the account balance
    private final String pin; // Stores the PIN for the account

    // Constructor to initialize balance and PIN
    public ATMManagementSystem(double initialBalance, String accountPin) {
        this.balance = initialBalance;
        this.pin = accountPin;
    }

    // Method to validate the entered PIN
    private boolean validatePin(String inputPin) {
        return pin.equals(inputPin);
    }

    // Method to display balance
    private void checkBalance() {
        System.out.printf("Your current balance is: $%.2f%n", balance);
    }

    // Method to deposit money
    private void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Successfully deposited $%.2f. Your new balance is $%.2f%n", amount, balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    // Method to withdraw money
    private void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.printf("Successfully withdrew $%.2f. Your new balance is $%.2f%n", amount, balance);
            } else {
                System.out.println("Insufficient balance. Please enter a smaller amount.");
            }
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    // Main method to run the ATM system
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Initialize ATM system with default values
        ATMManagementSystem atm = new ATMManagementSystem(500.0, "1234"); // $500 initial balance, PIN: 1234

        System.out.println("Welcome to the ATM!");
        System.out.print("Please enter your PIN: ");
        String enteredPin = scanner.nextLine();

        // Validate PIN
        if (!atm.validatePin(enteredPin)) {
            System.out.println("Invalid PIN. Access denied.");
            return;
        }

        System.out.println("Login successful!");
        while (true) {
            // Display menu options
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            // Handle menu options
            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
