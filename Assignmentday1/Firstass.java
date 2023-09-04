import java.util.Scanner;

public class Firstass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int milisecond=sc.nextInt();

        int hours=milisecond/3600000;
        
         milisecond=milisecond-3600000*hours;
         int minutes=milisecond/60000;
         milisecond=milisecond-60000*minutes;
         int seconds=milisecond/1000;
         System.out.println("Time "+hours+" "+minutes+" "+seconds);
         
        
    }
}