import java.util.Scanner;
public class GetBit{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        System.out.print("Enter Position : ");
        int pos = sc.nextInt();

        if (pos < 0) {
    System.out.println("Invalid position");
    return;
}

        int bitMask = 1<<pos;
        if((num & bitMask)==0){
            System.out.println("Bit Is 0");
        }
        else{
           System.out.println("Bit Is 1");
        }
        sc.close();
    }
}