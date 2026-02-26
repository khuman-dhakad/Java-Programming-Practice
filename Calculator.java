
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
    public static int calculateMul(int a,int b) {
        int mul = a*b;
        return mul;
    }
    public static float calculateDiv(int a,int b) {
        float div = (float)a/b;
        return div;
    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int a= sc.nextInt();
        System.out.print("Enter First Number:");
        int b= sc.nextInt();
 
        int res=calculateSum(a,b);
        System.out.println("Result Is: "+res);
 
        int diff=calculateMul(a,b);
        System.out.println("Result Is: "+diff);
        
 
        int mul=calculateDiff(a,b);
        System.out.println("Result Is: "+mul);
 
        float div=calculateDiv(a,b);
        System.out.println("Result Is: "+div);
        
    }
}