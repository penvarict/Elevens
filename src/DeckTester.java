/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.

	 */

	
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"ace","king","queen", "jack","10", "9","8","7","6","5" ,"4", "3", "2"};
		String[] suits = {"clubs", "spades", "diamonds", "hearts"};
		int[] values = {1,10,10,10,10,9,8,7,6,5,4,3,2};


		Deck standardDeck = new Deck( ranks, suits, values);

		System.out.println(standardDeck.deal());
		System.out.println(standardDeck.size());

		System.out.println(standardDeck.deal());
		System.out.println(standardDeck.size());

		System.out.println(standardDeck.deal());
		System.out.println(standardDeck.size());

		
	}
}
