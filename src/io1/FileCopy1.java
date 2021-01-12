package io1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy1 {
	
	
	// bad code - throws Exception을 사용하기때문에
	public static void main(String[] args) throws Exception{
		// 읽어들이는 빨대													  만약 파일 입력 잘못 입력하면
		InputStream in = new FileInputStream("C:\\zzz\\sample.jpg");   // java.io.FileNotFoundException:
		System.out.println(in);
		
		// 쓰는 빨대 - 파일이 없으면 자동 생성해준다
		OutputStream out = new FileOutputStream("C:\\zzz\\copy.jpg");
		
		// read - 1byte의 내용물을 읽어서 int 타입으로 반환 -> 맨 앞에서부터 커서가 이동하면서 읽는다
		// 몇 번 읽을지 모른다 ( 몇 byte로 구성되있는지 모른다)
		while(true) {
			// 맨앞부터 읽다가 더이상 읽을게 없으면 -1 반환
			int data = in.read();
			
			if(data == -1) {
				break;
			}
			out.write(data);
			
		} //end while
		
		
	} // main

}
