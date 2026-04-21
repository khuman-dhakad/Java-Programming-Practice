import java.util.Scanner;
public class SetBit{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        System.out.print("Enter Position : ");
        int pos = sc.nextInt();

        int bitMask = 1<<pos;
        int newNumber = num | bitMask;

        System.out.println(newNumber);
        sc.close();
    }
}