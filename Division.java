import java.util.Scanner;
public class Division{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number:");
        float a = sc.nextInt();

        System.out.print("Enter Second Number:");
        float b = sc.nextInt();
        float div = a/b;

        System.out.println("Result Is:"+div);
        
        sc.close();
    }
}