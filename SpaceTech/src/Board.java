import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Board extends JPanel {
    public static int WIDTH = 800;
    public static int HEIGHT = 600;
    private int deadGuns = 0;
    private final SpaceShip gun;
    public final Scoreboard scoreboard = new Scoreboard();
    public final List<Alien> aliens = new ArrayList<Alien>();
    public Board() {
        super();
        setSize(WIDTH, HEIGHT);
        setBackground(new Color(0, 0, 0));
        setFocusable(true);
        gun = new SpaceShip(this);
        SpaceShipController gc = new SpaceShipController(gun);
        addKeyListener(gc);
        repaint();
    }

    public void advance() {
        gun.advanceBullet();
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        scoreboard.paint(g2d);
        gun.paint(g2d);
    }

    public void reset() {
        scoreboard.reset();
        gun.reset();
        deadGuns = 0;
    }
}
