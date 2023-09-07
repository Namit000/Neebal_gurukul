import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of array");
        int N=sc.nextInt();
        int a[]=new int [N];
         System.out.println("Enter values");
        for(int i=0;i<N;i++){
           
             a[i]=sc.nextInt();
            
        }
        System.out.println("Reversed Array");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }


    }
    
}
