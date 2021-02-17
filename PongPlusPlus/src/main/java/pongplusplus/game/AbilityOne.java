package pongplusplus.game;


import pongplusplus.game.gameobjects.Ball;

public class AbilityOne {
    private final double pos_x;
    private double cooldown = 0;
    private Ball ball;
    private double startTime = 10;
    private boolean active = false;

    public AbilityOne(Ball ball, double pos_x) {
        this.ball = ball;
        this.pos_x = pos_x;
    }


    public void update(double deltaInSec) {
        startTime -= deltaInSec;

        if (cooldown >= 0){
            cooldown -= deltaInSec;
        }
        if (active) {
            if (startTime > 0) {
                if (pos_x == 970) {
                    if (ball.getPos_x() > Const.SCREEN_WIDTH / 2 + 14) {
                        ball.setSPEED(2);
                    } else if (ball.getPos_x() < Const.SCREEN_WIDTH / 2 + 14) {
                        ball.setSPEED(5);
                    }
                } else {
                    if (ball.getPos_x() < Const.SCREEN_WIDTH / 2 + 14) {
                        ball.setSPEED(2);
                    } else if (ball.getPos_x() > Const.SCREEN_WIDTH / 2 + 14) {
                        ball.setSPEED(5);
                    }
                }
            }
        }

        if (startTime <= 0) {
            ball.resetSpeed();
            active = false;
            startTime = 10;
        }

    }
    public void activate() {
        active = true;
    }

    public void deactivate(){
        active = false;
    }

    public double getCooldown() {
        return cooldown;
    }

    public void setCooldown(double cooldown) {
        this.cooldown = cooldown;
    }

    public boolean isActive() {
        return active;
    }
}