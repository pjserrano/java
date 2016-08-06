import java.sql.Date;

public class MilitaryTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hour = 0;
		int min = 0;
		int sec = 0;
		
		for (sec = 1; sec != -1; sec++) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException ie) {
			}
			if (sec >=60) {
				min++;
				sec = 0;
				if (min >=60) {
					hour++;
					min = 0;
					if (hour >= 24) {
						hour = 0;
						
					}
				}
			}
            if (hour < 10){
                System.out.print("0" + hour);
            }
            else{
                System.out.print(hour);
            }
            System.out.print(":");
       
         if (min < 10){
                System.out.print("0" + min);
            }
            else{
                System.out.print(min);
            }
         System.out.print(":");
        
         if (sec < 10){
                System.out.println("0" + sec);
            }
            else{
                System.out.println(sec);

		}
	   }
	}
}

