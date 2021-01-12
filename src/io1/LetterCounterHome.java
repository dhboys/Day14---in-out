package io1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class LetterCounterHome {

	public static void main(String[] args) throws Exception {
		
		Letter1[] arr = new Letter1[26];
		// 각 배열을 a~z로 채운다
		for (int i = 97; i <= 122; i++) {
			arr[i - 97] = new Letter1((char)i);
		}
		
		System.out.println(Arrays.toString(arr));
		
		InputStream fin = new FileInputStream("C:\\zzz\\cipher.txt");
		
		
		while(true) {
			
			int data = fin.read();
			
			if(data == -1) {break;}
			
			if ( data >= 65 && data <= 90) {
				data = data + 32;
			}
			
			if ( data >= 97 && data <= 122) {
				arr[ data -97 ].inc();
			}
			
		} // end while
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}	
}
