//import sun.security.util.Length;
import java.lang.Math;
/**
 * 
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 1;

	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {


		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 ***  
			put one half into even arrays and another half into odd spots
		*/

		int halfLength = values.length/2;//half length is 2
		
		int[] shuffled = new int[values.length];

		int j = 0;
		for(int i = 0; i < halfLength; i++){
			//first half of cards, put first 2 into even spots
			//shuffled[0] = values[0]
			//shuffled [2] = values[1]

			shuffled[j] = values[i];
			j = j + 2;
			//System.out.println(j);
		}

		int k = 1;
		
		for(int i = j-2; i< j; i++){
			//needs to start at half way i needs to be 2, put second half into odd spots
			//other half of cards
			//shuffled[1]= values[2]
			//shuffled[3] = values[3]

			shuffled[k] = values[i];
			k = k+2;
			//System.out.println(k);
		}// shuffled should be {0,2,1,3}

		for (int i = 0; i < shuffled.length; i++){
			values[i]=shuffled[i]; 
			
		}



		



	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */


		for( int k = values.length- 1; k >= 0; k-- ) {
            int r = (int)(Math.random() * k); //create random spot
            int tmp = values[r]; // set temporary int equal to number in random spot
            values[r] = values[k]; // set value at random spot to k spot, switch spots
           	values[k] = tmp; //set the k spot equal to number at other random spot
        }

	}

	// private static String flip(){
	// 	String heads = "heads";
	// 	String tails = "tails";
		
	// 	double r = (int)(Math.random());
	// 	if (r < 0.25){
	// 		return tails;
	// 	}	
	// 	else if (r >.25){
	// 		return heads;
	// 	}
	// }

	// private static Boolean arePermutations(int[] array1, int [] array2){
	// 	if(array1.length != array2.length) return false;

	// 	for(int i = array1.length; i< array1.length; i++){
	// 		for(int j = array1.length; j< array1.length; j++){
	// 			if(array1[i] = array2[i]) return false;
	// 			else{return true};

	// 		}
	// 	}


	// }
	
}
