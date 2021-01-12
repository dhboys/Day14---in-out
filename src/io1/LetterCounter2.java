package io1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class LetterCounter2 {

	public static void main(String[] args) throws Exception{
		
		// letter의 배열을 만든다
		// 알파벳 26글자
		Letter[] arr = new Letter[26];
		// a부터 z까지
		for (int i = 97; i <= 122; i++) {
								// int를 char로 바꾼다
			arr[i - 97] = new Letter((char)i); 
		}
		System.out.println(Arrays.toString(arr));
		
		InputStream fin = new FileInputStream("C:\\zzz\\alice.txt");
		
		while(true) {
			
			int data = fin.read();
			// 다 읽으면 -1반환
			if(data == -1) { break; }
			// 알파벳 대문자를 소문자로 변환
			if(data >= 65 && data <= 90) {
				data = data + 32;
			}
			
			// 알파벳이라면 97~122까지만 나올 것이다.
			if(data >= 97 && data <= 122) {
				arr[data-97].inc();
			}
		} // end while
		
		// comparable로 정렬 해주었으므로 
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}
