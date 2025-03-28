package com.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD5HashGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String str= scanner.nextLine();
		
		scanner.close();
		
		try {
			MessageDigest digest = MessageDigest.getInstance("MD5");
			
			byte[] hex = digest.digest(str.getBytes());
			
			StringBuilder builder = new StringBuilder();
			
			for (byte b : hex) {
				
				builder.append(String.format("%02x", b));
			}
			
			System.out.println(builder.toString());
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
