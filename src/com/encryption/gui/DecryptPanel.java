package com.encryption.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DecryptPanel extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 5103135407841083812L;
	private static JTextArea output;
	private static JButton decrypt_button;
	
	public DecryptPanel() {
		super();
		setLayout(new BorderLayout());
		
		output = new JTextArea();
		output.setEditable(false);
		
		decrypt_button = new JButton("Decrypt");
		
		add(decrypt_button, BorderLayout.NORTH);
		add(output, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

}
