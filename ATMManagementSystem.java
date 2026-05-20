import java.util.Scanner;


public class ATMManagementSystem {
float balance = 0;
    public  void checkBalance(){
    System.out.println("Your Amount = "+balance);
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
                    break;
                case 3 :
                    break;
                case 4 :
                    break;
                    default :
                    System.out.println("Enter valid choice!");
            }
    }
}