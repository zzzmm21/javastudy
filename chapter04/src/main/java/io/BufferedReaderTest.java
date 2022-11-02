package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		// 기반 스트림
		try {
			FileReader fr = new FileReader("./src/main/java/io/BufferedReaderTest.java");
			// 보조 스트림
			 br = new BufferedReader(fr);
			 
			 String line = null;
			 while((line =  br.readLine()) != null){
				 System.out.println(line);
				
			 }
		} catch (FileNotFoundException e) {
	
			System.out.println("Can Not open:"+ e);
		} catch (IOException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			}catch(IOException e){
				
			}
			
		}
	}

}
