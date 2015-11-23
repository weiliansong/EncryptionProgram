package com.encryption.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.encryption.Decrypter;

import java.io.*;

public class DecryptPanel extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 5103135407841083812L;
	private static JPanel upper;
	private static JTextArea output;
	private static JTextField key_field;
	private static JButton decrypt_button;
	private static JButton key_button;
	private static JButton encrypted_button;
	private static JFileChooser fc;
	private static File encrypted_file;
	private static File key_file;
	private static Decrypter decrypter;
	
	public DecryptPanel() {
		super();
		setLayout(new BorderLayout());
		upper = new JPanel();
		upper.setLayout(new GridLayout(2, 4));
		
		output = new JTextArea();
		output.setEditable(false);
		
		key_field = new JTextField(30);
		
		decrypt_button = new JButton("Decrypt");
		decrypt_button.addActionListener(this);
		key_button = new JButton("Choose File");
		key_button.addActionListener(this);
		encrypted_button = new JButton("Choose File");
		encrypted_button.addActionListener(this);
		
		fc = new JFileChooser();
		
		upper.add(new JLabel("Encrypted Message: "));
		upper.add(encrypted_button);
		upper.add(new JLabel(""));
		upper.add(new JLabel(""));
		upper.add(new JLabel("Key: "));
		upper.add(key_field);
		upper.add(new JLabel("-or-"));
		upper.add(key_button);
		
		add(upper, BorderLayout.NORTH);
		add(decrypt_button, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == encrypted_button) {
			int returnVal = fc.showOpenDialog(DecryptPanel.this);
			
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				encrypted_file = fc.getSelectedFile();
				
			}
		}
		else if(e.getSource() == key_button) {
			int returnVal = fc.showOpenDialog(DecryptPanel.this);
			
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				key_file = fc.getSelectedFile();
			}
		}
		else if(e.getSource() == decrypt_button) {
			if(encrypted_file.isFile() && key_file.isFile()) {
				decrypter = new Decrypter(encrypted_file.getPath(), key_file.getPath());
			}
		} else{}
	}

}
