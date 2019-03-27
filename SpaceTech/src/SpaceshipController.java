import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SpaceshipController implements KeyListener{
    private final Spaceship ship;

    public SpaceshipController(Spaceship g) {
        ship = g;
    }
    
    @Override
    public void keyTyped(KeyEvent e) {

    }
    //bindings for movement and shooting
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            ship.moveLeft();
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            ship.moveRight();
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            ship.fire();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
