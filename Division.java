import java.util.Scanner;
public class Division{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number:");
        float a = sc.nextInt();

        System.out.print("Enter Second Number:");
        float b = sc.nextInt();

        System.out.println(a/b);
        
        sc.close();
    }
}