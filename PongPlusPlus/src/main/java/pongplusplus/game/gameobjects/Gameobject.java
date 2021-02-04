package pongplusplus.game.gameobjects;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import pongplusplus.game.Images;

public abstract class Gameobject {

    private Image image;
    protected double pos_x;
    protected double pos_y;


    public Gameobject(double x, double y, Image image){
        this.pos_x = x;
        this.pos_y = y;
        this.image = image;
    }

    public abstract void update(double deltaInSec);
    public void draw(GraphicsContext gc){
        gc.drawImage(image,pos_x,pos_y);
    }
}