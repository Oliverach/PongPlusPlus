package pongplusplus.game.gameobjects;

import pongplusplus.game.AbilityOne;
import pongplusplus.game.Images;
import pongplusplus.game.KeyEventHandler;

public class RemotablePlate extends Gameobject{

    private KeyEventHandler keyEventHandler;
    private double SPEED = 250;
    private AbilityOne abilityOne;
    private Ball ball;
    public RemotablePlate(KeyEventHandler keyEventHandler, double x, double y, Board board){
        super(x,y, Images.plate);
        this.keyEventHandler = keyEventHandler;
        this.ball = board.getBall();
        abilityOne = new AbilityOne(ball, pos_x);
    }

    @Override
    public void update(double deltaInSec) {
        if (keyEventHandler.isUpKeyPressed() && pos_y > 61 ) {
            pos_y -= deltaInSec*SPEED;
        }else if (keyEventHandler.isDownKeyPressed() && pos_y < 541){
            pos_y += deltaInSec*SPEED;
        }
        if (keyEventHandler.isQKeyPressed()){
            abilityOne.activate();
        }
    }
}
