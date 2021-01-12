package io1;

public class StringTest {

	public static void main(String[] args) {
		
//		String str1 = "AAA";
//		
//		String str2 = "AAA";
//		
//		String str3 = new String("AAA");
//		
//		String str4 = new String("AAA");
//		
//		System.out.println(str1 == str2); // true
//		System.out.println(str3 == str4); // false
//		System.out.println(str1.equals(str2)); // true
//		System.out.println(str3.equals(str4)); // true
//		
//		// equals는 내용물만 비교하기 때문에 !
		
		String str = "ABCDEFG";
		
		// substr -> 항상 리턴값이 존재
		// 지정된 위치부터 끝까지
		String result1 = str.substring(3);
		
		System.out.println(result1);
		// 지정된 위치에서 특정위치까지
		String result2 = str.substring(1,4);
		
		System.out.println(result2);
		
		
		
		
		
		
	}
}
