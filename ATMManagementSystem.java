import java.util.Scanner;

public class ATMManagementSystem {

    float balance = 0;

    // Check Balance
    public void checkBalance() {
        System.out.println("Your Balance = " + balance);
    }

    // Deposit Money
    public void addBalance(float amount) {
        balance = balance + amount;
    }

    // Withdraw Money
    public void withdrawMoney(float withMoney) {
        balance = balance - withMoney;
    }

    public static void main(String[] args) {

        ATMManagementSystem obj = new ATMManagementSystem();

        int choice;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    obj.checkBalance();
                    break;

                case 2:

                    System.out.print("Enter Deposit Amount: ");
                    float amount = sc.nextFloat();

                    if (amount <= 0) {
                        System.out.println("Deposit amount must be positive!");
                    } else {
                        obj.addBalance(amount);
                        System.out.println("Amount deposited successfully!");
                    }

                    break;

                case 3:

                    System.out.print("Enter Withdraw Amount: ");
                    float withMoney = sc.nextFloat();

                    if (withMoney <= 0) {
                        System.out.println("Invalid amount!");
                    }

                    else if (obj.balance == 0) {
                        System.out.println("Insufficient Balance!");
                    }

                    else if (withMoney > obj.balance) {
                        System.out.println("Insufficient Balance!");
                    }

                    else {
                        obj.withdrawMoney(withMoney);
                        System.out.println("Amount withdrawn successfully!");
                    }

                    break;

                case 4:
                    System.out.println("Thank You for using ATM!");
                    break;

                default:
                    System.out.println("Enter valid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}