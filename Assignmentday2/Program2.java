import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x");
        int x=sc.nextInt();
        System.out.println("Enter y");
        int y=sc.nextInt();
        if(x==0 && y==0){
            System.out.println("origin");

        }
         if(x==0 && y!=0){
            System.out.println("y axis");
         }
         else if(y==0 && x!=0){
            System.out.println("X axis");
         }
         else if(x>0 && y>0){
            System.out.println("first quadrant");
         }
          else if(x<0 && y<0){
            System.out.println("2nd quadrant");
         }
          else if(x<0 && y>0){
            System.out.println("third quadrant");
         }
          else if(x>0 && y<0){
            System.out.println("fourth quadrant");
         }
    }
    
}
