import java.util.Scanner;

public class BasicProject {

    // Logic functions (clean & reusable)
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static int calculateDiff(int a, int b) {
        return a - b;
    }

    public static int calculateMul(int a, int b) {
        return a * b;
    }

    public static float calculateDiv(int a, int b) {
        return (float) a / b;
    }

    public static int calculateRem(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Calculator ---");
            System.out.println("1.Addition");
            System.out.println("2.Subtract");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Remainder");
            System.out.println("6.Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 5) {

                System.out.print("Enter First Number: ");
                int a = sc.nextInt();

                System.out.print("Enter Second Number: ");
                int b = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + calculateSum(a, b));
                        break;
                    case 2:
                        System.out.println("Result: " + calculateDiff(a, b));
                        break;
                    case 3:
                        System.out.println("Result: " + calculateMul(a, b));
                        break;
                    case 4:
                        if (b == 0) {
                            System.out.println("Cannot divide by zero");
                        } else {
                            System.out.println("Result: " + calculateDiv(a, b));
                        }
                        break;
                    case 5:
                        if (b == 0) {
                            System.out.println("Cannot find remainder");
                        } else {
                            System.out.println("Result: " + calculateRem(a, b));
                        }
                        break;
                }
            } else if (choice != 6) {
                System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
        System.out.println("Thank you!");
    }
}