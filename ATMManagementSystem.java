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
            int choice;
            Scanner sc = new Scanner(System.in);
            do{
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter Your Choice : ");

            choice = sc.nextInt();

            switch(choice){
                case 1 :
                    obj.checkBalance();
                    break;
                case 2 :
                    System.out.print("How much amount you want deposit : ");
                    float amount = sc.nextFloat();
                    if(amount<=0){
                        System.out.println("Deposite amount must be positive!");
                    }
                    else{
                    obj.addBalance(amount);
                    System.out.println("Amout deposite successfully!");
                    }
                    break;
                case 3 :
                    System.out.print("How much amount you want withdraw : ");
                    float withMoney = sc.nextFloat();
                    if(obj.balance == 0){
                        System.out.println("Insufficient Balance!");
                        sc.close();
                        return;
            }
                    if(withMoney > obj.balance){
                        System.out.println("Insufficient Balance!");
                        sc.close();
                        return;
                    }
                    obj.withdrawMoney(withMoney);
                    System.out.println("Amout withdraw successfully!");
                    break;
                case 4 :
                    System.out.println("Thankyou!");
                    sc.close();
                    return;
                    default :
                    System.out.println("Enter valid choice!");
            }
        }while(choice!=4);
    }
}