import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name:");
        String name = sc.nextLine();

        
        System.out.print("Enter Your Age:");
        int age= sc.nextInt();
        
        System.out.println("Your Name Is:" + name);
         System.out.println("Your Age Is:"+age);



        sc.close();
    }
}