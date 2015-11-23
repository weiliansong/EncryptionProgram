package com.encryption;

import java.util.ArrayList;

public class Encrypter {
	private static String message;
	private static int[][] m_processed;
	private static ArrayList<char[]> pre_processed;
	
	public Encrypter(String m_message) {
		message = m_message;
	}
	
	private void processString() {
		String[] temp = message.split(" ");
		int maximum_length = 0;
		for(String word : temp) {
			if(word.length() > maximum_length) 
				maximum_length = word.length();
		}
		for(String word : temp) {
			char[] word_char = new char[maximum_length];
			System.arraycopy(word, 0, word_char, 0, word.length());
			pre_processed.add(word_char);
		}
		m_processed = new int[pre_processed.size()][maximum_length];
		for(char[] word : pre_processed) {
			
		}
	}
}
