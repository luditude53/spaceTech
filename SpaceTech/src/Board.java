import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Board extends JPanel {
	//Declarations
    public static int WIDTH = 800;
    public static int HEIGHT = 600;
    private final Spaceship ship;
    public final Scoreboard scoreboard = new Scoreboard();
    public final List<Alien> aliens = new ArrayList<Alien>();
    
    public Board() {
        super();
        setSize(WIDTH, HEIGHT);
        setBackground(new Color(30, 30, 30));
        setFocusable(true);
        ship = new Spaceship(this);
        SpaceshipController gc = new SpaceshipController(ship);
        addKeyListener(gc);
        repaint();
    }
    
    //move bullet across screen
    public void advance() {
        ship.advanceBullet();
        repaint();
    }
    
    //paint game board
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        scoreboard.paint(g2d);
        ship.paint(g2d);
    }
    
    public void reset() {
        scoreboard.reset();
        ship.reset();
    }
}