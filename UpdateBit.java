import java.util.Scanner;
public class UpdateBit{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        System.out.print("Enter Position : ");
        int pos = sc.nextInt();


        System.out.println("1. Set Bit(Create 1)"); 
        System.out.println("2. Clear Bit(Create 0)"); 
        System.out.print("Enter Opertion : ");
        int choice = sc.nextInt();

        int bitMask=1<<pos;
        if(choice==1){
            int newNumber1 =  bitMask | num;
            System.out.println(newNumber1);
        }
        else if(choice==2){
            int newNumber2 = num & (~bitMask);
             System.out.println(newNumber2);
        }
        else{
            System.out.println("Enter Valid Input!");
        }
        sc.close();
    }
}