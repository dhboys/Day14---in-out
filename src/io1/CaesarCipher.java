package io1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class CaesarCipher {

	public static void main(String[] args) throws Exception {
		
		// 알파벳의 배열을 만든다.
		char[] arr = new char[26];
		
		for (int i = 97; i <= 122; i++) {
			arr[i - 97] = (char)(i+3);
			
			if( arr[i - 97] > 122) {
				arr[i - 97] -= 26;
			}
		}	
		// 메모장에서 해독을 원하는 편지를 읽어온다
		InputStream fin = new FileInputStream("C:\\zzz\\cipher.txt");
		
		while (true) {
			
			int data = fin.read();
			
			if ( data == -1 ) {break;}
			
		
			
		}
		
		
	}
}
