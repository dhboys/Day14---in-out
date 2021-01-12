package io1;

public class StringTest2 {

	public static void main(String[] args) {
		
		String str = "Hello World My name is Alice";
		
		int idx = str.indexOf("My");
		
		System.out.println(idx);
		
		String str2 = str.substring(idx);
		
		System.out.println(str2);
	}
}
