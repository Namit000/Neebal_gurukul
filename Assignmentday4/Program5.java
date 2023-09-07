import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of array");
        int N=sc.nextInt();
        int a[]=new int [N];
         System.out.println("Enter values");
        for(int i=0;i<N;i++){
           
             a[i]=sc.nextInt();
            
        }
        int min = 0;
        for(int i=0; i<N; i++) { 
            if( a[i]<a[min])
            {
               min = i;
            }
        }
        System.out.println("index of minimum elment  "+min);
    }
    
}
