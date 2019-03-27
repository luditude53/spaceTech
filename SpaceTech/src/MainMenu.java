

import javax.swing.JPanel;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainMenu extends JFrame implements ActionListener {
	
	JFrame window;
	JPanel mainMenuPanel;
	JLabel mainMenuLabel;
	JPanel startBtnPanel;
	JPanel quitBtnPanel;
	JPanel howBtnPanel;
	Container con;
	JButton startBtn;
	JButton quitBtn;
	JButton howToBtn;
	Font titleFont = new Font("Agency FB", Font.PLAIN, 90);
	Font normalFont = new Font("Agency FB", Font.PLAIN, 15);
	
	public static void main(String[] args) {
		
		new MainMenu();

	}
	
	public MainMenu() {
		
		window = new JFrame("SpaceTech");
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		con = window.getContentPane();
		
		mainMenuPanel = new JPanel();
		mainMenuPanel.setBounds(100, 100, 600, 150);
		mainMenuPanel.setBackground(Color.black);
		mainMenuLabel = new JLabel("SpaceTech");
		mainMenuLabel.setForeground(Color.green);
		mainMenuLabel.setFont(titleFont);
		
		startBtnPanel = new JPanel();
		startBtnPanel.setBounds(300, 325, 200, 50);
		startBtnPanel.setBackground(Color.black);
		
		startBtn = new JButton("Start");
		startBtn.setBackground(Color.black);
		startBtn.setForeground(Color.white);
		startBtn.setFont(normalFont);
		
		quitBtnPanel = new JPanel();
		quitBtnPanel.setBounds(300, 425, 200, 50);
		quitBtnPanel.setBackground(Color.black);
		
		quitBtn = new JButton("Quit");
		quitBtn.setBackground(Color.black);
		quitBtn.setForeground(Color.white);
		quitBtn.setFont(normalFont);
		
		howBtnPanel = new JPanel();
		howBtnPanel.setBounds(300, 375, 200, 50);
		howBtnPanel.setBackground(Color.black);
		
		howToBtn = new JButton("How to play");
		howToBtn.setBackground(Color.black);
		howToBtn.setForeground(Color.white);
		howToBtn.setFont(normalFont);
		
		mainMenuPanel.add(mainMenuLabel);
		startBtnPanel.add(startBtn);
		quitBtnPanel.add(quitBtn);
		howBtnPanel.add(howToBtn);
		
		quitBtn.addActionListener(this);
		howToBtn.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	        	HowToMenu frame = new HowToMenu();
	        	frame.setVisible(true);

	        }

	    });
		
		startBtn.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	        	Game frame = new Game();
	        	frame.setVisible(true);
	        	Thread t = new Thread(frame);
	            t.start();

	        }

	    });
		
		con.add(mainMenuPanel);
		con.add(startBtnPanel);
		con.add(quitBtnPanel);
		con.add(howBtnPanel);
	}

		@Override
		public void actionPerformed(ActionEvent event) {
			System.exit(0);
		}

}
