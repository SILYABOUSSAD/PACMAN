package PacmanGame.ViewObjects;

import PacmanGame.Helpers.Coordinate;

import java.awt.*;

public class Wall extends MazeObject {

    public Wall(Coordinate coordinate){
        this.coordinate = coordinate;
    }
    @Override
    public void drawMe(Graphics g) {
        g.setColor(new Color(252,255,255));
        g.fill3DRect(coordinate.getX(),coordinate.getY(),25,25,true);
    }

    @Override
    public String Collision() {
        return "Wall";
    }
}
