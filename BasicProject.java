import java.util.Scanner;

public class BasicProject {

    // Function to calculate the sum of two numbers entered by the user
    public static void calculateSum(Scanner sc) {

        System.out.print("Enter First Number:");
        int a = sc.nextInt();

        System.out.print("Enter Second Number:");
        int b = sc.nextInt();

        int res = a + b;
        System.out.println("Result Is:" + res);
    }

    // Function to calculate the difference between two numbers
    public static void calculateDiff(Scanner sc) {

        System.out.print("Enter First Number:");
        int a = sc.nextInt();

        System.out.print("Enter Second Number:");
        int b = sc.nextInt();

        int diff = a - b;
        System.out.println("Result Is:" + diff);
    }

    // Function to calculate the multiplication of two numbers
    public static void calculateMul(Scanner sc) {

        System.out.print("Enter First Number:");
        int a = sc.nextInt();

        System.out.print("Enter Second Number:");
        int b = sc.nextInt();

        int mul = a * b;

        System.out.println("Result Is:" + mul);

    }

    // Function to perform division and handle divide-by-zero case
    public static void calculateDiv(Scanner sc) {

        System.out.print("Enter First Number:");
        int a = sc.nextInt();

        System.out.print("Enter Second Number:");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            float div = (float)a / b;
            System.out.println("Result Is:" + div);
        }
    }

    // Function to calculate the remainder of two numbers using modulus operator
    public static void calculateRem(Scanner sc) {

        System.out.print("Enter First Number:");
        int a = sc.nextInt();

        System.out.print("Enter Second Number:");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("Error: Cannot find remainder when divisor is 0.");
        } else {
            int rem = a % b;
            System.out.println("Result Is: " + rem);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\n----------------------------");
            System.out.println("| Welcome to My Calculator |");
            System.out.println("----------------------------");

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
                    calculateDiff(sc);
                    break;
                case 3:
                    calculateMul(sc);
                    break;
                case 4:
                    calculateDiv(sc);
                    break;
                case 5:
                    calculateRem(sc);
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