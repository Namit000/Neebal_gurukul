import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lower number");
        int L=sc.nextInt();
        System.out.println("enter upper number ");
        int U=sc.nextInt();
        boolean t=true;
        int x=0,y=1,z;
        if(L==x){
            System.out.println(x);
        }
        else if(L<=y){
            System.out.println(y);
        }
        while(t){
            z=x+y;
            x=y;
            y=z;
            if((L<=z) &&(U>z)){
                System.out.println(z);
            }
            else if(U<z){
                t=false;
            }

        }
    }
    
}
