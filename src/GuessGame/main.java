package GuessGame;

import GuessGame.controllers.GameController;
import GuessGame.models.Game;
import GuessGame.views.Console;

public class main {
    public static void main(String[] args) {
        Game game = new Game();
        GameController gameController = new GameController(game);
        Console view = new Console(gameController);
        view.run();
    }
}
