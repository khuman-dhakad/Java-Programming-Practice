import java.util.Scanner;
public class printName{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
          sc.nextLine();

        String [] name = new String [size];
        
        sc.close();
    }
}