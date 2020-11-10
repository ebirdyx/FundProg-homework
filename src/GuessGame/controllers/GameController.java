// controller has validation which means

package GuessGame.controllers;

import GuessGame.models.Answer;
import GuessGame.models.Game;

public class GameController {
    private Game game;

    public GameController(Game game) {
        this.game = game;
    }

    public Answer guess(String input) {  //validation of the int
        int number;
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException exception) {
            number = 0;
        }

        return this.game.guess(number);
    }

    public void regenerateNumber() {
        this.game.regenerateNumber();
    }
}