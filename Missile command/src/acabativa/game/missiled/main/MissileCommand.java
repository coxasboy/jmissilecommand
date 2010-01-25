package acabativa.game.missiled.main;

import acabativa.game.missiled.controller.GameControllerImpl;
import acabativa.game.missiled.model.GameModelImpl;
import acabativa.game.missiled.view.GameView;

public class MissileCommand {

	public static void main(String[] args) {
		GameModelImpl model = new GameModelImpl(GameView.MAX_WIDHT, GameView.MAX_HEIGHT);
		GameControllerImpl controller = new GameControllerImpl(model);
	}
	
}
