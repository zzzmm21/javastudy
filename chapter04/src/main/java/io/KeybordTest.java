package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeybordTest {

	public static void main(String[] args) {
		BufferedReader br = null;
	
		try {
			//1. 기반 스트림(표준입력, stdin, system.in)
			//2. 보조 스트림1(byte | byte | byte -> char)
			InputStreamReader isr = new InputStreamReader(System.in,"utf-8");
			//3. 보조 스트림2(char1|char2|chr3|\n - "char1char2char3")

			br = new BufferedReader(isr);
			
			String line = null;
			while((line = br.readLine()) != null) {
				if("quit".equals(line)) {
					break;
				}
				System.out.println(line);
			}
		} catch (UnsupportedEncodingException e) {
			System.out.println("Error:"+ e);
		} catch (IOException e) {
			System.out.println("Error:"+ e);
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
				
			} catch(IOException e) {
				
			}
			
		}

		

	}

}
