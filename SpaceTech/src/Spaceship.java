import java.awt.*;
import javax.swing.*;

public class Spaceship {
	//Declarations
    public int x = 0;
    private final int vx = 8;
    public int y = Board.HEIGHT - 110;
    private int[] xPointOffsets = { 0, 60, 60, 35, 35, 30, 25, 25,  0,  0};
    private int[] yPointOffsets = {20, 20, 10, 10, 10,  0, 10, 10, 10, 20};
    private int currentX = xPointOffsets.length;
    private int currentY = yPointOffsets.length;
    private int[] currentXs = new int[xPointOffsets.length];
    private int[] currentYs = new int[yPointOffsets.length];
    private Board board;
    private final Bullet bullet = new Bullet(board);
    
    public Spaceship(Board board) {
        this.board = board;
    }
    
    //Shoot
    public void advanceBullet() {
        bullet.move();
    }
    
    public void fire() {
    	bullet.fire(x + 28, y);
    }
    
    public void reset() {
        x = 0;
    }
    
    //Movement
    public void moveRight() {
        x = x + vx;
    }
    
    public void moveLeft() {
        x = x - vx;
        if (x < 0) {
            x = 0;
        } 
    }
    
    //paint the ship and bullet
    public void paint(Graphics2D g) {
        calcPoints();        
        //front section
        Polygon poly = new Polygon(currentXs, currentYs, xPointOffsets.length);
        g.setColor(Color.RED);
        g.fill(poly);
        //engine
        g.setColor(Color.RED);
        g.fillRect(currentX + 22, currentY + 30, 16, 15);
        //main body
        g.setColor(Color.GREEN);
        g.fillOval(currentX + 20, currentY - 15, 20, 55);
        //cockpit
        g.setColor(Color.BLUE);
        g.fillOval(currentX+22, currentY, 15, 15);
        
        bullet.paint(g);
    }
    
    //calculate coordinates for drawing
    private void calcPoints() {
        for (int i = 0; i < xPointOffsets.length; i++) {
           int newX = x + xPointOffsets[i];
           int newY = y + yPointOffsets[i];
           currentX = newX;
           currentY = newY;
           currentXs[i] = newX;
           currentYs[i] = newY;
        }
    }
}