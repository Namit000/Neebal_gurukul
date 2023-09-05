import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,t=0,res=0,count=0;
        System.out.println("First 10 even fibonacci");
        for(;count<10;){
            res=a+b;
            t=a;
            a=b;
            b=res;
            if(res%2==0){
                System.out.println(res+" ");
                count++;
            }
        }
    }
    
}
