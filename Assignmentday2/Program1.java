import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        double x=sc.nextDouble();
        x=Math.toRadians(x);
        double sum=1;
        double fact=1;
        double N=1;
        for(int i=1;i<=19;i++){
            fact=fact*i;
            if(i%2==0){
                N=-N*x*x;
                sum=sum+(N/fact);
            }
        }
        System.out.println(sum);
    }
    
}
