import java.util.Scanner;

// Step 4: User's Bank Account Class
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }
}

// Step 1: ATM Machine Class
class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    // Step 3: ATM Functional Methods
    public void withdraw(double amount) {
        if (account.withdraw(amount)) {
            System.out.println(" Withdrawal successful. Amount: ₹" + amount);
        } else {
            System.out.println("Withdrawal failed. Insufficient balance or invalid amount.");
        }
    }

    public void deposit(double amount) {
        if (account.deposit(amount)) {
            System.out.println("Deposit successful. Amount: ₹" + amount);
        } else {
            System.out.println("Deposit failed. Please enter a valid amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + account.getBalance());
    }
}

// Step 2 & 7: User Interface and Main Class
public class ATMInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 5: Connect BankAccount to ATM
        BankAccount userAccount = new BankAccount(1000); // initial balance ₹1000
        ATM atm = new ATM(userAccount);

        System.out.println("===== Welcome to Simple ATM Machine =====");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    break;

                case 3:
                    atm.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println(" Invalid choice. Please try again.");
            }
        }
    }
}
