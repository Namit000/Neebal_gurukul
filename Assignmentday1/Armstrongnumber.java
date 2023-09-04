import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the digit");
        int N=sc.nextInt();
        int Number=N;double sum=0;
        int R=Number%10;
        double a=Math.pow(R, 3);
        Number=Number/10;
        int r1=Number%10;
        double b=Math.pow(r1, 3);
         Number=Number/10;
         int r2=Number%10;
         double c=Math.pow(r2, 3);
         sum=(a+b+c);
         if(N==sum){
            System.out.println("Armstrong number");
         }
         else{
            System.out.println("Not armstrong number");
         }

    }
    
}
