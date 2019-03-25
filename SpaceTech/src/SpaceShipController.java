
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SpaceShipController implements KeyListener{
    private final SpaceShip gun;

    public SpaceShipController(SpaceShip g) {
        gun = g;
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            gun.moveLeft();
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            gun.moveRight();
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            gun.fire();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}