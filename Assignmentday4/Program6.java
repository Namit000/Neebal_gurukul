public class Program6 {
    public static void main(String[] args) {
        int[] profits = {12, 18, 20, 38, 53, 93, 77, 61,59,  56};
        int min = -1;
        for(int i=1; i<profits.length; i++) { 
            if( profits[i]<=profits[i-1])
            {
                min=i;
               break;
            }
        }
           if(min!=-1){
            System.out.println("Declined profit year "+(2001+min));
           }
           else{
            System.out.println("No decline");
           }
       
    }
    
}
