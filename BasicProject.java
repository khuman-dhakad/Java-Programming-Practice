import java.util.Scanner;

public class BasicProject {
    public static void calculateSum(Scanner sc) {

        System.out.print("Enter First Number:");
        int a = sc.nextInt();

        System.out.print("Enter Second Number:");
        int b = sc.nextInt();

        int res = a + b;
        System.out.println("Result Is:" + res);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("-----------------------");
            System.out.println("Welcome to My Calculator");
            System.out.println("-----------------------");

            System.out.println("1.Addition");
            System.out.println("2.Subtract");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Remainder");
            System.out.println("6.Exit");

            System.out.print("\nEnter Your Choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    calculateSum(sc);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Thankyou BBye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Enter Valid Choice");
            }
        } while (choice != 6);

    }
}