import java.util.Scanner;

public class Addition {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number:");
        int a = sc.nextInt();

        System.out.print("Enter Second Number:");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Result Is:" + sum);

        sc.close();
    }
}