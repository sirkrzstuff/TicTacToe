package main.java.is.ru.fenrir.tictactoe;

import java.awt.GridLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Graphics extends JFrame {
	
	/**
	 * Default constructor that sets up the tictactoe board.
	 */
	public Graphics() {
		
		JButton[] buttons = new JButton[9];
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 3));
		
		for(int i = 0; i < 9; i++)
		{
			buttons[i] = new JButton("");
			buttons[i].setFont(new Font("Arial", Font.BOLD, 80));
			panel.add(buttons[i]);
		}
		
		
		JLabel status = new JLabel("X´s turn");
		add(panel, BorderLayout.CENTER);
		add(status, BorderLayout.SOUTH);
		//Settings
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("TicTacToe");
	}
}
