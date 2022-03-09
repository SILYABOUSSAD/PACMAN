package PacmanGame;

import javax.swing.*;

public class Labyrinthe extends JFrame {

    public Labyrinthe(Game game){
        setTitle("Pacman");
        //Controllers
        addKeyListener(new Listenner(game));
        //Configs
        add(game.getView());
        setSize(500,640);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
