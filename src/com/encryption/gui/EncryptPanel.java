package com.encryption.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class EncryptPanel extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 5320899935756985511L;
	private static JTextField input;
	private static JButton encrypt_button;
	
	public EncryptPanel() {
		input = new JTextField(30);
		
		encrypt_button = new JButton("Encrypt");
		
		add(input, BorderLayout.WEST);
		add(encrypt_button, BorderLayout.EAST);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
