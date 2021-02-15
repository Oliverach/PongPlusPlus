package pongplusplus.main;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import pongplusplus.common.Navigator;
import pongplusplus.common.SceneType;
import pongplusplus.game.Const;
import pongplusplus.gui.GameOverScene;
import pongplusplus.gui.InGameScene;
import pongplusplus.gui.WelcomeScene;

public class  PongPlusPlusApp extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("PONG++");
        Navigator navigator = new Navigator(stage);
        navigator.registerScene(SceneType.WELCOME, new WelcomeScene(navigator));
        navigator.registerScene(SceneType.INGAME, new InGameScene(navigator));
        navigator.registerScene(SceneType.GAMEOVER, new GameOverScene(navigator));
        navigator.goTo(SceneType.WELCOME);
        stage.setMinHeight(Const.SCREEN_HEIGHT);
        stage.setMaxHeight(Const.SCREEN_HEIGHT);
        stage.setMinWidth(Const.SCREEN_WIDTH);
        stage.setMaxWidth(Const.SCREEN_WIDTH);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
