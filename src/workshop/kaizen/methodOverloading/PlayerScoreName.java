package workshop.kaizen.methodOverloading;

public class PlayerScoreName {

	public static void main(String[] args) {
		
		int newScore = calculateScore("Ranveer", 500);
		System.out.println("Ranveer Your new Score = " +newScore);
		
		calculateScore(75);
		calculateScore();
		
	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.println(playerName+ " " + "Scored : " + score + " Points" );
		return score * 1000;
	}
	
	public static int calculateScore(int score) {
		System.out.println("Un named player Scored : " + score + " Points" );
		return score * 1000;
	}
	
	public static int calculateScore() {
		System.out.println("No name , No Score");
		return 0;
	}
	
}
