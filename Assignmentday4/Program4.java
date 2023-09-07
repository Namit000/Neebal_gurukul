public class Program4 {
    public static void main(String[] args) {
        int[] ev = {850, 945, 1145, 1155, 1230, 1245, 1330, 1340, 1425, 1445};

        int totalTime = 0;

        
        for (int i = 0; i < ev.length; i += 2) {
            int onTime = ev[i];
                int offTime = ev[i + 1];
            int onHours = onTime / 100;
            int onMinutes = onTime % 100;
              int offHours = offTime / 100;
            int offMinutes = offTime % 100;
               int passHours = offHours - onHours;
            int passMinutes = offMinutes - onMinutes;

            totalTime += (passHours * 60 + passMinutes);
        }

        int hours = totalTime / 60;
        int minutes = totalTime % 60;

        System.out.println("Running Time: " + hours + " hr " + minutes + " min");
    }
    
}
