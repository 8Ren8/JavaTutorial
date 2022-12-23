import java.util.Scanner;

public class account {
    public static void main(String args[]) {
        double balance = 0, deposit, withdraw;
        int choice = 0;

        Scanner sc = new Scanner(System.in);

        while (choice != 4) {
            System.out.println("Welcome to Black & White ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.println("Please enter your choice: ");

            /// choice = sc.nextInt();

            if (sc.hasNextInt() == false) {
                System.out.println("Please enter an integer.");
                sc.nextLine();
            } else {
                choice = sc.nextInt();
            }

            switch (choice) {
                case 1: {
                    System.out.println("Your balance is RM" + balance + "\n");
                    break;
                }

                case 2: {
                    System.out.println("Please enter amount to deposit: ");
                    deposit = sc.nextDouble();
                    balance = balance + deposit;
                    System.out.println("Deposit success!");
                    System.out.println("Your new balance is RM" + balance + "\n");
                    break;
                }
                case 3: {
                    System.out.println("Please enter amount to withdraw: ");
                    withdraw = sc.nextDouble();
                    if (balance < withdraw) {
                        System.out.println("Sadly, you do not have enough money to withdraw.");
                        System.out.println("Your balance is RM" + balance + "\n");
                    } else {
                        balance = balance - withdraw;
                        System.out.println("Withdraw success!");
                        System.out.println("Your new balance is RM" + balance + "\n");
                    }
                    break;
                }
                case 4: {
                    System.out.println("\nThank you for using this black & white ATM.");
                    break;
                }
                default: {
                    System.out.println("Invalid choice, please select from 1 to 4.\n");
                }
            }
        }

        sc.close();
    }
}
