package com.encryption.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.encryption.Encrypter;


public class EncryptPanel extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 5320899935756985511L;
	private static JTextField input;
	private static JButton encrypt_button;
	private static Encrypter encrypter;
	private static int[][] temp;
	
	public EncryptPanel() {
		input = new JTextField(30);
		
		encrypt_button = new JButton("Encrypt");
		encrypt_button.addActionListener(this);
		
		add(input, BorderLayout.WEST);
		add(encrypt_button, BorderLayout.EAST);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String text = input.getText();
		encrypter = new Encrypter(text);
		encrypter.returnArray();
	/*	for(int[] word : temp) {
			for(int letter : word) {
				System.out.println(String.valueOf(letter) + " ");
			}
			System.out.println('\n');
		} */
	}
}
