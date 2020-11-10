
// model has the data and the business logic

package GuessGame.models;

import java.util.Random;

/**
 * This Class holds the game logic.
 */
public class Game {
    final int MIN_RANGE = 1;   // final is a constant
    final int MAX_RANGE = 1000;

    private int numberToGuess;

    /**
     * This method Guesses the number.
     *
     * @param number This is user input value.
     * @return Returns an answer.
     */
    public Answer guess(int number) {
        if (MIN_RANGE > number || number > MAX_RANGE) {
            return Answer.OUTSIDE_RANGE;
        }
        if (number < numberToGuess) {
            return Answer.TOO_LOW;
        }
        if (number > numberToGuess) {
            return Answer.TOO_HIGH;
        }
        return Answer.CORRECT;
    }

    /**
     *  This method generates a new number to guess.
     */
    public void regenerateNumber() {
        Random random = new Random();
        numberToGuess = random.nextInt(MAX_RANGE - MIN_RANGE + 1) + MIN_RANGE;
    }
}
