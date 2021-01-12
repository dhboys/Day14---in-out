package io1;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class KeyMemo {
	// bad code
	public static void main(String[] args) throws Exception{
		
//		InputStream in = System.in;    // ( System도 inputStream) // 키보드가 읽을 준비가 됨
		
		OutputStream out = new FileOutputStream("C:\\zzz\\test.txt");
		
		String str = "가나";
		
		// 문자열을 byte로 변화할 수 있다.
		byte[] arr = str.getBytes("UTF-8");  // -> UTF-8로 세팅
		System.out.println(arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			
			int data = arr[i];
			out.write(data);
			
		} // end for
		
		
	}
}
