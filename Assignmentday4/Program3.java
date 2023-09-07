import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String m[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        int sale[] = new int[12];
        int quarter[] = new int[3];
        int ts = 0;
        System.out.println("Enter monthly sales");
        for(int i=0;i<12;i++) {
            sale[i] = sc.nextInt();
            ts += sale[i];
        }
        
        
        for(int i=0;i<12;i++) {

            if(i<4) {
                quarter[0] +=  sale[i];
            }
            if(i>=4 && i<=7) {
                quarter[1] +=  sale[i];
            }
            if(i>=8 && i<=11) {
                quarter[2] +=  sale[i];
            }
        }
        System.out.println("Monthly Sales: ");
        for(int i=0;i<12;i++) {
            System.out.println(m[i]+" : "+sale[i]);
        }
        System.out.println();
        System.out.println("Quarterly Sales:");
        for(int i=0;i<3;i++) {
            System.out.println("quarter "+(i+1)+" "+quarter[i]);
        }
        System.out.println();
        System.out.println("Total Sales: "+ts);
    }
}
    
    

