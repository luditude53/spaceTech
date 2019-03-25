
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class OptionsMenu implements ActionListener {
	
	JFrame window;
	JPanel optionsMenuPanel;
	JLabel optionsMenuLabel;
	JPanel optionsTextPanel;
	JLabel optionsTextLabel;
	Container con;
	Font titleFont = new Font("Agency FB", Font.PLAIN, 75);
	Font normalFont = new Font("Agency FB", Font.PLAIN, 15);
	Font optionFont = new Font("Agency FB", Font.PLAIN, 25);

	public static void main(String[] args) {
		
		new OptionsMenu();
	}
	
	public OptionsMenu() {
		
		window = new JFrame("SpaceTech");
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();
		
		optionsMenuPanel = new JPanel();
		optionsMenuPanel.setBounds(100, 50, 600, 100);
		optionsMenuPanel.setBackground(Color.black);
		optionsMenuLabel = new JLabel("Options");
		optionsMenuLabel.setForeground(Color.green);
		optionsMenuLabel.setFont(titleFont);
		
		optionsTextPanel = new JPanel();
		optionsTextPanel.setBackground(Color.black);
		optionsTextPanel.setBounds(100, 175, 600, 250);
		optionsTextLabel = new JLabel("Instructions: \n");
		optionsTextLabel.setForeground(Color.white);
		optionsTextLabel.setFont(optionFont);
		
		optionsMenuPanel.add(optionsMenuLabel);
		optionsTextPanel.add(optionsTextLabel);
		
		con.add(optionsMenuPanel);
		con.add(optionsTextPanel);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		this.setVisible(false);
		new MainMenu().setVisible(true);
	}

	public void setVisible(boolean b) {
	}

}

