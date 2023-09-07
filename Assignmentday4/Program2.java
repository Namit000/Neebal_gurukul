public class Program2 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,1};
        double percentage=0;
        double sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                sum=sum+arr[i];
            }
            percentage=(sum/arr.length)*100;
        }
        System.out.println("Attendence Percentage of student "+percentage);
    }
    
}
