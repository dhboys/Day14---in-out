package io1;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Memo1 {

	// bad code
	public static void main(String[] args) throws Exception {

		// 파일에다 데이터 쓰는 코드
		
		Scanner scanner = new Scanner(System.in);
		
		// 파일에다 보내려고 쓰는 OutputStream
		// append 모드 -> 원래 쓰여있던거 뒤에 붙는다
		OutputStream fos = new FileOutputStream("C:\\zzz\\diary.txt", true);
		// OutputStream( String name , boolean ) -> append 모드
		// 키보드에서 문자열 입력받는다
		System.out.println("입력하세요");
		// scanner.nextLine()이 \n을 떼어내고 보내니까 저장시킬 때 \n 붙여서 저장시켜 다음에 읽을 때 어디서 끊었는지 알기위해 \n붙임
		String str = scanner.nextLine() + "\n";
		// 들어온 문자열을 UTF-8로 인코딩해서 바이트로 변환해서 읽어들임
		byte[] arr = str.getBytes("UTF-8");
		// getBytes -> 문자열 (char[])을 byte[]로 바꾼다.
		// 배열에 집어넣음
		for (int j = 0; j < arr.length; j++) {
			fos.write(arr[j]);
		}
		
	} // end main
}
