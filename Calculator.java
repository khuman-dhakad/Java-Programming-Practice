import java.util.Scanner;

class Calculator {

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
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return (float) a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("Addition Is: " + sum);

        int diff = calculateDiff(a, b);
        System.out.println("Difference Is: " + diff);

        int mul = calculateMul(a, b);
        System.out.println("Multiplication Is: " + mul);

        float div = calculateDiv(a, b);
        System.out.println("Division Is: " + div);

        sc.close();
    }
}