package com.encryption;

public class Decrypter {
	private static String p_encrypted;
	private static String p_key;
	
	public Decrypter(String encrypted_path, String key_path) {
		p_encrypted = encrypted_path;
		p_key = key_path;
	}
	
}
