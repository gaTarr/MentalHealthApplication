package tests;

import java.util.Date;

import model.Score;
import model.User;

/**
 * @author Craig Longnecker
 * Class UserScoreTests
 *
 */
public class UserScoreTests { // class UserScoreTests.

	private static final Date Date = new Date();

	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) { // Begin main.
		
		// Test User.
		User testUser = new User("testusername", "TestPassword123456789");
		System.out.print("Test User - ");
		System.out.println(testUser.toString());
		
		// Test Score.
		Score testScore = new Score(21, 999);
		testScore.setDate(Date);
		System.out.print("Test Score - ");
		System.out.println(testScore.returnScoreDetails());
	} // Close main.
} // Close class UserScoreTests.
