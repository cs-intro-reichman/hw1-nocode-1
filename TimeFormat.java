// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {

		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		int convert = hours;


		
        if (hours == 0) {
            System.out.print("00:");  
        } else {
            
            int newTime = hours % 12;
            if (newTime == 0) {
                newTime = 12;  
            }
			
			System.out.print(newTime + ":");
			

			if (minutes < 10 ) {
				System.out.print("0" + minutes);
			} else {
				System.out.print(minutes);
			} 
		
		} 
		if (convert < 12) {
			System.out.print(" AM");
		} else {
			System.out.print(" PM");
		}

	}
}