import java.util.Scanner;

public class BasicProject {

    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static int calculateDiff(int a, int b) {
        return a - b;
    }

    public static int calculateMul(int a, int b) {
        return a * b;
    }

    public static double calculateDiv(int a, int b) {
        return (double) a / b;
    }

    public static int calculateRem(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Calculator ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 5) {

                System.out.print("Enter First Number: ");
                int a = sc.nextInt();

                System.out.print("Enter Second Number: ");
                int b = sc.nextInt();

                if ((choice == 4 || choice == 5) && b == 0) {
                    System.out.println("Error: Cannot divide by zero");
                    continue;
                }

                double result = 0;

                switch (choice) {
                    case 1:
                        result = calculateSum(a, b);
                        break;
                    case 2:
                        result = calculateDiff(a, b);
                        break;
                    case 3:
                        result = calculateMul(a, b);
                        break;
                    case 4:
                        result = calculateDiv(a, b);
                        break;
                    case 5:
                        result = calculateRem(a, b);
                        break;
                }

                System.out.println("Result: " + result);

            } else if (choice != 6) {
                System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        sc.close();
        System.out.println("Thank you!");
    }
}