package exercise001;

public class TurnCount {
	
	private static int count = 1;
	
	public static int returnTurnCount() {
		count++;
		return count - 1;
	}

}
