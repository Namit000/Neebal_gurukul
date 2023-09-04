import java.util.Scanner;

public class Military {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the code");
        int hour;
        int Digit=sc.nextInt();
        int a =Digit%100;
        int b=Digit/100;
        if(b>12){
         hour=b-12;
        System.out.println(hour+":"+a+" pm");}
           
        else{
            hour=a;
              System.out.println(hour+":"+a+" am");
        }
      
        
    }
    
}
