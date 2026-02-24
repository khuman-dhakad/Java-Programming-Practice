import java.util.Scanner;
public class Multiplication{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number:");
        int a = sc.nextInt();

        System.out.print("Enter Second Number:");
        int b = sc.nextInt();

        int mul= a*b;

        System.out.println(mul);
        
        sc.close();
    }
}