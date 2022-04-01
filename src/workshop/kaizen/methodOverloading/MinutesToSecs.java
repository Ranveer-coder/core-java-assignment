package workshop.kaizen.methodOverloading;

public class MinutesToSecs {

	public static void main(String[] args) {

		String sec = getDurationString(120, 59);
		System.out.println(sec);
		
		System.out.println(getDurationString(3959));
	}

	public static String getDurationString(long mins, long sec) {
		
		if((mins < 0) || (sec < 0) && (sec > 60)) {
			return "Invlaid";	
	}
		long hour = mins / 60;
		long remainingMins = mins % 60;
		
		return hour+ "h " + remainingMins + "m " + sec + "s ";
	}

	public static String getDurationString(long seconds) {
		if(seconds < 0 ) {
			return "Invalid";
		}
		long minutes = seconds / 60;
		long remainingSeconds = seconds % 60;
		return getDurationString(minutes, remainingSeconds);
	}
	
}