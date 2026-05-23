import java.util.Scanner;


public class ATMManagementSystem {
    float balance = 0;
    public  void checkBalance(){
    System.out.println("Your Amount = "+balance);
}
public void addBalance(float amount){
    balance = balance + amount;
}
public void withdrawMoney(float withMoney){
    balance = balance - withMoney;
}

    public static void main(String[] args) {
        ATMManagementSystem obj = new ATMManagementSystem();

        Scanner sc = new Scanner(System.in);

        

            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter Your Choice : ");

            int choice = sc.nextInt();

            switch(choice){
                case 1 :
                    obj.checkBalance();
                    break;
                case 2 :
                    System.out.print("How much amount you want deposit : ");
                    float amount = sc.nextFloat();
                    obj.addBalance(amount);
                    System.out.println("Amout deposite successfully!");
                    break;
                case 3 :
                    System.out.print("How much amount you want withdraw : ");
                    float withMoney = sc.nextFloat();
                    obj.withdrawMoney(withMoney);
                    System.out.println("Amout withdraw successfully!");
                    break;
                case 4 :
                    break;
                    default :
                    System.out.println("Enter valid choice!");
            }
    }
}