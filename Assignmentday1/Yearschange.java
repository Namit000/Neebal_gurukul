import java.util.Scanner;

public class Yearschange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of days");
        int Digit=sc.nextInt();
        int A=Digit/365;
        int B=Digit%365;
        int month=B/30;
        int months=B%30;
        int week=months/7;
        int weeks=months%7;
        int day=weeks/1;
        
        System.out.println("year "+A+" months "+month+" weeks "+week+" days "+day);
    }
    
}
