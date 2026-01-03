public class TypeConversion { 

	public static void main(String[] args) { 
		byte b = 127; // byte 변수 b 선언
		int i = 100; // int 변수 i 선언
		
		System.out.println(b+i); // b가 int 타입으로 자동 변환 
		System.out.println(10/4); // 정수끼리 나눗셈
		System.out.println(10.0/4); // 4가 4.0으로 자동 변환 
		System.out.println((char)0x12340041); // 16진수를 char로 변환
		System.out.println((int)2.9 + 1.8); // 2.9를 int로 변환 후 더함
		System.out.println((int)(2.9 + 1.8)); // 더한 값을 int로 변환
		System.out.println((int)2.9 + (int)1.8); // 각각 int로 변환 후 더함

	} 

} 