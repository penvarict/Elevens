import java.util.List;
import java.util.ArrayList;

/**
 * This class represents a Board that can be used in a collection
 * of solitaire games similar to Elevens.  The variants differ in
 * card removal and the board size.
 */
public abstract class Board {

	/**
	 * The cards on this board.
	 */
	private Card[] cards;

	/**
	 * The deck of cards being used to play the current game.
	 */
	private Deck deck;

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;

	/**
	 * Creates a new <code>Board</code> instance.
	 * @param size the number of cards in the board
	 * @param ranks the names of the card ranks needed to create the deck
	 * @param suits the names of the card suits needed to create the deck
	 * @param pointValues the integer values of the cards needed to create
	 *                    the deck
	 */
	public Board(int size, String[] ranks, String[] suits, int[] pointValues) {
		cards = new Card[size];
		deck = new Deck(ranks, suits, pointValues);
		if (I_AM_DEBUGGING) {
			System.out.println(deck);
			System.out.println("----------");
		}
		dealMyCards();
	}

	/**
	 * Start a new game by shuffling the deck and
	 * dealing some cards to this board.
	 */
	public void newGame() {
		deck.shuffle();
		dealMyCards();
	}

	/**
	 * Accesses the size of the board.
	 * Note that this is not the number of cards it contains,
	 * which will be smaller near the end of a winning game.
	 * @return the size of the board
	 */
	public int size() {
		return cards.length;
	}

	/**
	 * Determines if the board is empty (has no cards).
	 * @return true if this board is empty; false otherwise.
	 */
	public boolean isEmpty() {
		for (int k = 0; k < cards.length; k++) {
			if (cards[k] != null) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Deal a card to the kth position in this board.
	 * If the deck is empty, the kth card is set to null.
	 * @param k the index of the card to be dealt.
	 */
	public void deal(int k) {
		cards[k] = deck.deal();
	}

	/**
	 * Accesses the deck's size.
	 * @return the number of undealt cards left in the deck.
	 */
	public int deckSize() {
		return deck.size();
	}

	/**
	 * Accesses a card on the board.
	 * @return the card at position k on the board.
	 * @param k is the board position of the card to return.
	 */
	public Card cardAt(int k) {
		return cards[k];
	}

	/**
	 * Replaces selected cards on the board by dealing new cards.
	 * @param selectedCards is a list of the indices of the
	 *        cards to be replaced.
	 */
	public void replaceSelectedCards(List<Integer> selectedCards) {
		for (Integer k : selectedCards) {
			deal(k.intValue());
		}
	}

	/**
	 * Gets the indexes of the actual (non-null) cards on the board.
	 *
	 * @return a List that contains the locations (indexes)
	 *         of the non-null entries on the board.
	 */
	public List<Integer> cardIndexes() {
		List<Integer> selected = new ArrayList<Integer>();
		for (int k = 0; k < cards.length; k++) {
			if (cards[k] != null) {
				selected.add(new Integer(k));
			}
		}
		return selected;
	}

	/**
	 * Generates and returns a string representation of this board.
	 * @return the string version of this board.
	 */
	public String toString() {
		String s = "";
		for (int k = 0; k < cards.length; k++) {
			s = s + k + ": " + cards[k] + "\n";
		}
		return s;
	}

	/**
	 * Determine whether or not the game has been won,
	 * i.e. neither the board nor the deck has any more cards.
	 * @return true when the current game has been won;
	 *         false otherwise.
	 */
	public boolean gameIsWon() {
		if (deck.isEmpty()) {
			for (Card c : cards) {
				if (c != null) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	/**
	 * Method to be completed by the concrete class that determines
	 * if the selected cards form a valid group for removal.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	public abstract boolean isLegal(List<Integer> selectedCards);

	public boolean isLegal(List<Integer> selectedCards){
		int card;
		if (selectedCards.size >= 3){
			for (i=0; i< selectedCards.size; i++){
				card = selectedCards.get(i);
				if(card != 10){ return false;}
				else return true;

			}

		}else if(selectedCards.size = 2 && selectedCards.get(i)+selectedCards(i+1)= 11)  {
				return true;
		}else return false;


	}

	/**
	 * Method to be completed by the concrete class that determines
	 * if there are any legal plays left on the board.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	public abstract boolean anotherPlayIsPossible();

	public boolean anotherPlayIsPossible(){
		int size = cards.length();
		int numberofFaceCards = 0;

		for (i=0; i< size; i++){
			if (cards[i] = 10){
				numberofFaceCards ++;
			}
			else if (numberofFaceCards = 3){
				return true;
			}
		}
		// for (i=0; i< size; i++){
		// 	for (i=0; i< size; i++){
		// 		for (i=0; i< size; i++){
		// 			for (i=0; i< size; i++){
		// 				for (i=0; i< size; i++){
		// 					for (i=0; i< size; i++){
		// 						for (i=0; i< size; i++){
		// 							for (i=0; i< size; i++){
		// 								for (i=0; i< size; i++){
											
											
		// 								}
										
		// 							}	
									
		// 						}	
								
		// 					}
		// 				}
		// 			}	
		// 		}
		// 	}
		// }

		for (i=0; i< size; i++){ // card being compared, has to move by one everytieme
			int h = 0;
			for (h=0; h<size; h++){ //always has to start at zero 
				if ( card[i]+card[h] = 11){ 
					return true;
				}

			}

		}return false;


	}

	/**
	 * Deal cards to this board to start the game.
	 */
	private void dealMyCards() {
		for (int k = 0; k < cards.length; k++) {
			cards[k] = deck.deal();
		}
	}
}
