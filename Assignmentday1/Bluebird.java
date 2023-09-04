import java.util.Scanner;

public class Bluebird {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int bluebus= number/50;
        int tourist = bluebus*50;
        System.out.println("travelling passenger "+tourist);

    }
    
}
