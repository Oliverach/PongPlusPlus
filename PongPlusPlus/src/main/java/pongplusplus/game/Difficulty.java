package pongplusplus.game;

import pongplusplus.common.Navigator;
import pongplusplus.common.SceneType;

public class Difficulty {
    private double difficulty;

    public void setDifficulty(double speed, Navigator navigator) {
        this.difficulty = speed;
        navigator.goTo(SceneType.INGAME);
    }


    public double getDifficulty() {
        return this.difficulty;
    }
}