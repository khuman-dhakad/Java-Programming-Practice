
import java.util.Scanner;

class Calculator {
    public static int calculateSum(int a,int b) {
        int sum = a+b;
        return sum;
    }
    public static int calculateDiff(int a,int b) {
        int diff = a-b;
        return diff;
    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int a= sc.nextInt();
        System.out.print("Enter First Number:");
        int b= sc.nextInt();
 
        int res=calculateSum(a,b);
        System.out.println("Result Is: "+res);
 
        int diff=calculateDiff(a,b);
        System.out.println("Result Is: "+diff);
        
    }
}