package application;

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
	JPanel optionBtnPanel;
	Container con;
	JButton startBtn;
	JButton quitBtn;
	JButton optionBtn;
	Font titleFont = new Font("Agency FB", Font.PLAIN, 90);
	Font normalFont = new Font("Agency FB", Font.PLAIN, 15);
	
	public static void main(String[] args) {
		
		new MainMenu();

	}
	
	public MainMenu() {
		
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		optionBtnPanel = new JPanel();
		optionBtnPanel.setBounds(300, 375, 200, 50);
		optionBtnPanel.setBackground(Color.black);
		
		optionBtn = new JButton("Options");
		optionBtn.setBackground(Color.black);
		optionBtn.setForeground(Color.white);
		optionBtn.setFont(normalFont);
		
		mainMenuPanel.add(mainMenuLabel);
		startBtnPanel.add(startBtn);
		quitBtnPanel.add(quitBtn);
		optionBtnPanel.add(optionBtn);
		
		quitBtn.addActionListener(this);
		optionBtn.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	        	OptionsMenu frame = new OptionsMenu();
	        	frame.setVisible(true);

	        }

	    });
		
		startBtn.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
	        	Start frame = new Start();
	        	frame.setVisible(true);

	        }

	    });
		
		con.add(mainMenuPanel);
		con.add(startBtnPanel);
		con.add(quitBtnPanel);
		con.add(optionBtnPanel);
	}

		@Override
		public void actionPerformed(ActionEvent event) {
			System.exit(0);
		}

}
