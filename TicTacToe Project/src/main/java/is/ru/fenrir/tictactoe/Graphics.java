package main.java.is.ru.fenrir.tictactoe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Graphics {
	
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("TicTacToe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel emptyLabel = new JLabel("");
		emptyLabel.setPreferredSize(new Dimension(475, 380));
		frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
