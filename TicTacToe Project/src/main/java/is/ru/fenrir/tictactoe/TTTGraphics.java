package main.java.is.ru.fenrir.tictactoe;

import java.awt.GridLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


@SuppressWarnings("serial")
public class TTTGraphics extends JFrame {
	public static final boolean PLAYER_X = false;
	public static final boolean PLAYER_O = true;
	
	private JButton[] buttons = new JButton[9];
	private JLabel status;
	private boolean player;
	private boolean gameover = false;
	private int counter = 0;
	
	/**
	 * Getters / Setters
	 */
	public JButton getJButton(int value) {
		return getButtons()[value];
	}
	
	public char getButtonValue(int buttonId) {
		if (getButtons()[buttonId].getText() == "")
			return Integer.toString(buttonId).toCharArray()[0];
		return getButtons()[buttonId].getText().toCharArray()[0];
	}
	
	public void setButtonValue(int buttonId, String sign) {
		getButtons()[buttonId].setText(sign);
	}
	
	public boolean getGameover() {
		return gameover;
	}
	
	/**
	 * Default constructor that sets up the tictactoe board.
	 */
	public TTTGraphics() {
	
		player = PLAYER_X;
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 3));
		status = (new JLabel("X's turn"));
		
		for(int i = 0; i < 9; i++)
		{
			getButtons()[i] = new JButton("");
			getButtons()[i].setFont(new Font("Arial", Font.BOLD, 80));
			getButtons()[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() instanceof JButton) {
						if (((JButton)e.getSource()).getText() == "X" ||  ((JButton)e.getSource()).getText() == "O" || gameover)
						{
							
						}
						else
						{
							((JButton)e.getSource()).setText(player ? "O" : "X");
							player = !player;
							status.setText(player ? "O's turn" : "X's turn");
							counter++;
						}
					}
				}
			});
			panel.add(getButtons()[i]);
		}
		
		add(panel, BorderLayout.CENTER);
		add(status, BorderLayout.SOUTH);
		//Settings
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("TicTacToe");
	}
		
	
	
	public void setGameOver(boolean value) {
		gameover = value;
	}
	
	public boolean boardFull() {
		for (int i = 0; i < 9; i++) {
			if (getButtons()[i].getText() == "")
				return false;
		}
		return true;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public void changeButtonFontColor(int buttonId, Color color) {
		getButtons()[buttonId].setForeground(color);
	}

	public JButton[] getButtons() {
		return buttons;
	}

	public String getStatus() {
		return status.getText();
	}
	
	public void changeStatus(String newStatus) {
		status.setText(newStatus);
	}
}
