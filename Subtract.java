import java.util.Scanner;
public class Subtract{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number:");
        int a = sc.nextInt();

        System.out.print("Enter Second Number:");
        int b = sc.nextInt();

        int diff = a-b;
        System.out.println("Differene Is:"+diff);
        
        sc.close();
    }
}