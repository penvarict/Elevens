/**
 * This is a class that tests the Card class.
 */
public class CardTester {
	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card kingOfHearts = new Card("king", "hearts",12);
		Card queenOfSpades = new Card("queen", "spades", 11);
		Card jackOfClubs = new Card("jack", "clubs",10);

		System.out.println(kingOfHearts.rank());
		System.out.println(jackOfClubs.suit());
		System.out.println(jackOfClubs.matches(kingOfHearts));
	}
}
