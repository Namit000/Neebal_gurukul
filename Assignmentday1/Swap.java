import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter 4 digit number");
     int N=sc.nextInt();
     int S=N%100;
     N=N/100;
     System.out.println("half swap "+S+N);

    }
    
}
