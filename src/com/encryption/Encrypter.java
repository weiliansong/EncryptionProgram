package com.encryption;

import java.util.ArrayList;
import java.util.Arrays;

public class Encrypter {
	private static String message;
	private static int[][] m_processed;
	private static char[][] pre_processed;
	
	public Encrypter(String m_message) {
		message = m_message;
	}
	
	public void returnArray() {
		processString();
		encrypt();
	}
	
	private void processString() {
		String[] temp = message.split(" ");
		int maximum_length = 0;
		for(String word : temp) {
			if(word.length() > maximum_length) 
				maximum_length = word.length();
		}
		
		pre_processed = new char[temp.length][maximum_length];
		for(char[] word : pre_processed) {
			Arrays.fill(word, '0');
		}
		
		int i = 0;
		for(String word : temp) {
		//	char[] word_char = new char[maximum_length];
			for(int j = 0; j < word.length(); j++) {
				pre_processed[i][j] = word.charAt(j);
			}
			i++;
		}
		
		m_processed = new int[temp.length][maximum_length];
		
		int outer_loop = 0;
		for(char[] word : pre_processed) {
			int inner_loop = 0;
			for(char letter : word) {
				if(letter != '0') {
					m_processed[outer_loop][inner_loop] = (int) letter;
					inner_loop++;
				}
				else if(letter == '0'){
					m_processed[outer_loop][inner_loop] = 0;
					inner_loop++;
				}
			}
			outer_loop++;
		}
	}
	
	private void encrypt() {
		int[] four_corners = new int[4];
		
		four_corners[0] = m_processed[0][0];
		four_corners[1] = m_processed[0][m_processed[0].length-1];
		four_corners[2] = m_processed[m_processed.length-1][0];
		four_corners[3] = m_processed[m_processed.length-1][m_processed[m_processed.length-1].length-1];
		
		for(int i = 0; i < 4; i++) {
			if(four_corners[i] >= 100) {
				four_corners[i] = (four_corners[i] / 100) * 10 + (four_corners[i] % 100);
			}
		}
		
		int[] permutation = new int[4];
		permutation[0] = four_corners[0] / 10;
		permutation[1] = four_corners[0] % 10;
		permutation[2] = four_corners[1] / 10;
		permutation[3] = four_corners[1] % 10;
		
		int[] math = new int[4];
		math[0] = four_corners[2] / 10;
		math[1] = four_corners[2] % 10;
		math[2] = four_corners[3] / 10;
		math[3] = four_corners[3] % 10;
		
		permutate(permutation);
		calculate(math);
	}
	
	private void permutate(int[] permutation) {
		int left = permutation[0];
		int down = permutation[0];
		int right = permutation[0];
		int up = permutation[0];
		
		
	}
	
	private void calculate(int[] math) {
		int subtract = math[0];
		int multiply = math[1];
		int divide = math[2];
		int add = math[3];
		
		
	}
	
	private void left(int movement) {
		for(int i = 0; i < m_processed.length; i++) {
			for(int current = m_processed[i].length; current >= 0; current--) {
				
			}
		}
	}
}
