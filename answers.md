1. Discuss the similarities and differences between Elevens, Thirteens, and Tens.  
    - The similarities between these games is that they all have the same rules just with the different number of cards. 
    
2. As discussed previously, all of the instance variables are declared in the Board class. But it is the ElevensBoard class that “knows” the board size, and the ranks, suits, and point values of the cards in the deck. How do the Board instance variables get initialized with the ElevensBoard values? What is the exact mechanism? 

    -Those are defaults. Because you don't always extend a class, you need to have a default so the program will always run. When you extend the class then you can change around your variables.

3. Now examine the files Board.java, and ElevensBoard.java, found in the Activity8 Starter Code directory. Identify the abstract methods in Board.java. See how these methods are implemented in ElevensBoard. Do they cover all the differences between Elevens, Thirteens, and Tens as discussed in question 1? Why or why not? 

    -The abstract methods are isleagal and possibleplay. You could always write a new method with the same name in a differnt game class to change aroudn the rules if you wish. This covers all the differences since you can change the number of cards on the boards at a given time, the rules with the isLeagal method as well as the possible play method. 

    