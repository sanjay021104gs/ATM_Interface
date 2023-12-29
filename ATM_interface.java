import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class ATM {
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String withdraw(double amount) {
        if (bankAccount.getBalance() >= amount) {
            bankAccount.setBalance(bankAccount.getBalance() - amount);
            return "Successfully withdrew " + amount + ". Your new balance amount is " + bankAccount.getBalance() + ".";
        } else {
            return "Failed to withdraw. Insufficient balance.";
        }
    }

    public String deposit(double amount) {
        bankAccount.setBalance(bankAccount.getBalance() + amount);
        return "Successfully deposited " + amount + ". Your new balance amount is " + bankAccount.getBalance() + ".";
    }

    public String checkBalance() {
        return "Your current balance is " + bankAccount.getBalance() + ".";
    }
}

public class ATM_interface{
    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount(500);
        ATM myATM = new ATM(myBankAccount);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to Withdraw the amount \n\nPress 2 to Deposit the amount \n\nPress 3 to check the Balance amount\n ");
        System.out.print("Your Input : ");
        int choice = scanner.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                System.out.print("Enter the amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                System.out.println();
                System.out.println(myATM.withdraw(withdrawAmount));
                break;
            case 2:
                System.out.print("Enter the amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                System.out.println();
                System.out.println(myATM.deposit(depositAmount));
                break;
            case 3:
                System.out.println(myATM.checkBalance());
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }
}