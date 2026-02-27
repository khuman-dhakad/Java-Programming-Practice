import java.util.Scanner;

public class BasicProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 0;

        do {
            System.out.println("-----------------------");
            System.out.println("Welcome to My Calculator");
            System.out.println("-----------------------");

            System.out.println("1.Addition");
            System.out.println("1.Subtract");
            System.out.println("1.Multiplication");
            System.out.println("1.Division");
            System.out.println("1.Exit");

            System.out.println("\nEnter Your Choice:");
            choice = sc.nextInt();

        } while (choice != 5);

        sc.close();
    }
}