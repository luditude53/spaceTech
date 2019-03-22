import java.awt.image.BufferedImage;

public class Start extends MainMenu {
	
private static final int WIDTH = 320;
public static final int HEIGHT = WIDTH / 12 * 9;
public static final int SCALE = 2

private boolean running = false;
private Thread thread;

private BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
private BufferedImage spriteSheet = null;
private BufferedImage background = null;

private boolean is_shooting = false;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

public static void main(String[] args) {
	
	new Start();
}
}