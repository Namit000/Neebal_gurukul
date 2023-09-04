import java.util.Scanner;

public class Largest3of {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
         System.out.println("Enter the 2nd number");
        int b=sc.nextInt();
         System.out.println("Enter the 3rd number");
        int c=sc.nextInt();
        int d=a>b ? a:b;
        int biggest=c>d ? c:d;
        System.out.println("largest number is "+biggest);
        
    }
    
}
