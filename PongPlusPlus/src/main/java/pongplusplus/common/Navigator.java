package pongplusplus.common;

import javafx.scene.Scene;
import javafx.stage.Stage;
import pongplusplus.game.SceneType;
import pongplusplus.gui.GameOverScene;
import pongplusplus.gui.GamemodeSelectionScene;
import pongplusplus.gui.InfoScene;
import pongplusplus.gui.DifficultySelectionScene;
import java.util.HashMap;
import java.util.Map;

public class Navigator {

    private Stage stage;
    private Map<SceneType, Scene> sceneMap = new HashMap<>();

    public Navigator(Stage stage) {
        this.stage = stage;
    }

    public void registerScene(SceneType enumScene, Scene scene) {
        sceneMap.put(enumScene, scene);
    }

    public void goTo(SceneType enumScene) {
        Scene activeScene = sceneMap.get(enumScene);
        if (activeScene instanceof Initializable) {
            ((Initializable) activeScene).onInitialize();
        }
        if (activeScene instanceof GameOverScene) {
            activeScene = GameOverScene.getScene();
        } else if (activeScene instanceof DifficultySelectionScene) {
            activeScene = DifficultySelectionScene.getScene();
        } else if (activeScene instanceof InfoScene) {
            activeScene = InfoScene.getScene();
        } else if (activeScene instanceof GamemodeSelectionScene) {
            activeScene = GamemodeSelectionScene.getScene();
        }
        stage.setScene(activeScene);
    }
}
