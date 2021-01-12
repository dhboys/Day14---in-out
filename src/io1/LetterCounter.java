package io1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class LetterCounter {

	public static void main(String[] args) throws Exception{
		
		// 알파벳이 몇 번 나오는지의 배열 { 0,0,0,0,0,0,....... }
		// 90~122(a~z) 사이의 숫자가 나오면 배열을 채운다
		int[] arr = new int[26];
 		
		InputStream fin = new FileInputStream("C:\\zzz\\alice.txt");
		
		while(true) {
			
			int data = fin.read();
			// 다 읽으면 -1 반환하여 break
			if(data == -1) { break; }
			
			// 대문자를 소문자로 바꾼다.  65~90 = A~Z
			if(data >= 65 && data <= 90) {
				data = data + 32;
			}
			
			// 알파벳이라면 97~122까지만 나올 것이다.
			if(data >= 97 && data <= 122) {
				// 각 알파벳이 나올때마다 자기 번호의 카운트 1씩 증가
				arr[data-97] = arr[data-97] + 1;
			}
			
			System.out.println(data);
			
		} //end while
		
		System.out.println(Arrays.toString(arr));
	} // end main
}
