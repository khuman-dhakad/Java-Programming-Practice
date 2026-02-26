
import java.util.Scanner;

class Calculator {
    public static void calculateSum(int a,int b) {

        System.out.println(a+b);

    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int a= sc.nextInt();
        System.out.print("Enter First Number:");
        int b= sc.nextInt();
 
        calculateSum(a,b);
        
    }
}