
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HowToMenu implements ActionListener {
	
	JFrame window;
	JPanel howMenuPanel;
	JLabel howMenuLabel;
	JPanel howTextPanel;
	JLabel howTextLabel;
	Container con;
	Font titleFont = new Font("Agency FB", Font.PLAIN, 75);
	Font normalFont = new Font("Agency FB", Font.PLAIN, 15);
	Font optionFont = new Font("Agency FB", Font.PLAIN, 25);

	public static void main(String[] args) {
		
		new HowToMenu();
	}
	
	public HowToMenu() {
		
		window = new JFrame("SpaceTech");
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();
		
		howMenuPanel = new JPanel();
		howMenuPanel.setBounds(100, 50, 600, 100);
		howMenuPanel.setBackground(Color.black);
		howMenuLabel = new JLabel("How to play");
		howMenuLabel.setForeground(Color.green);
		howMenuLabel.setFont(titleFont);
		
		howTextPanel = new JPanel();
		howTextPanel.setBackground(Color.black);
		howTextPanel.setBounds(100, 175, 600, 250);
		howTextLabel = new JLabel("Use the left and right arrow Keys to move around."
				+ " Use the Spacebar to shoot");
		howTextLabel.setForeground(Color.white);
		howTextLabel.setFont(optionFont);
		
		howMenuPanel.add(howMenuLabel);
		howTextPanel.add(howTextLabel);
		
		con.add(howMenuPanel);
		con.add(howTextPanel);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		this.setVisible(false);
		new MainMenu().setVisible(true);
	}

	public void setVisible(boolean b) {
	}

}

