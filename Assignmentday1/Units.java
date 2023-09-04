import java.util.Scanner;

public class Units {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Name : ");
        String name=sc.nextLine();
        
        System.out.println("units : ");
        int units=sc.nextInt();
        int temp=units;
        
        double result;
        if(units<=100){
            result=units*4;
        }
        if(units<=300){
            result=400;
            units=units-100;
            result=result+units*5;
        }
        else{
            result=1400;
            units=units-300;
            result=result+units*10;
        }double resultsc=0.05*result+result;
        double total=0.18*resultsc+resultsc;
        System.out.println("Name "+name);
        System.out.println("units "+temp);
        System.out.println("amout "+total);

    }
    
}
