package workshop.kaizen.Methods;

public class calculateScore {

	public static void main(String[] args) {
		
		boolean gameOver = true;
		int Score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		int highScore = calculateScore(gameOver, Score, levelCompleted, bonus); //called parameters
		System.out.println("Your high score = " +highScore);
		
		
		highScore = calculateScore(true,10000,8,200); //called arguments
		System.out.println("Your high score is " +highScore);
		
		calculateScore(true, 100000000, 100000000, 100000000); // directly assigning values to parameters.
		
	
		int HighScore = calculateHighScorePosition(1500);
		int position = displayHighScore("Ranveer Khokhar Anand", 1);
		
		HighScore = calculateHighScorePosition(900);
		position = displayHighScore("Tim", 2);
		
		HighScore = calculateHighScorePosition(400);
		position = displayHighScore("Arthur", 3);
		
		HighScore = calculateHighScorePosition(50);
		position = displayHighScore("Thomas", -1);
		
		HighScore = calculateHighScorePosition(1000);
		position = displayHighScore("Thomas", 2);
	}	
		
	public static int calculateScore(boolean gameOver, int Score , int levelCompleted, int bonus) {
					
		
		if(gameOver) {
			int finalScore = Score + levelCompleted * bonus;
			finalScore += 2000;
			System.out.println("Your final score is " + finalScore);
			
			return finalScore;
		}
		return -1;
		
		
		
	}
	
	public static int displayHighScore(String name , int position) {
		
		
		int highScore = position;
		System.out.println(name + " Your position is : " +position);
		return highScore;
		
		}
	public static int calculateHighScorePosition(int HighScore) {
		
		
		if(HighScore >= 1000) {
			return 1;
		}else if(HighScore >= 500 && HighScore <= 1000) {
			return 2;
		}else if(HighScore >= 100 && HighScore <= 500) {
			return 3;
		}else {
			return -1;
		}

	
}

}