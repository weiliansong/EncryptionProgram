package com.encryption.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class WindowFrame extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = -5291864690811484988L;
	private static final int WIDTH = 500;
	private static final int HEIGHT = 300;
	
	private static JTabbedPane tab_panel;
	private static DecryptPanel decrypt_panel;
	private static EncryptPanel encrypt_panel;
	
	public WindowFrame() {
		super("Shhhhhhhh.......");
		
		setSize(WIDTH, HEIGHT);
		setMinimumSize(new Dimension(WIDTH, HEIGHT));
		setResizable(false);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		decrypt_panel = new DecryptPanel();
		encrypt_panel = new EncryptPanel();
		
		tab_panel = new JTabbedPane();		
		tab_panel.add("Decrypt", decrypt_panel);
		tab_panel.add("Encrypt", encrypt_panel);
		
		add(tab_panel, BorderLayout.CENTER);
		
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
