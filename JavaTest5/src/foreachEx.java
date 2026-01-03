// 예제 3-9 : for-each 문 활용
public class foreachEx {
	enum Week { 월, 화, 수, 목, 금, 토, 일 } // 열거형 상수로 요일 정의

	public static void main(String[] args) {
		int[] n = { 1,2,3,4,5 }; // 정수형 배열 n 생성 및 초기화
		String names[] = { "사과", "배", "바나나", "체리", "딸기", "포도" } ; // 문자열 배열 names 생성 및 초기화
		
		int sum = 0; // 합계를 저장할 변수 0으로 초기화
		// 아래 for-each에서 k는 n[0], n[1], ..., n[4]로 반복
		
		for (int k : n) // 배열 n의 각 요소를 변수 k에 순서대로 대입하며 반복
		{
			System.out.print(k + " "); // 반복되는 k 값 출력
			sum += k; // k의 값을 sum에 누적
		}
		
		System.out.println("합은 " + sum); // 계산된 합계 출력
		
		// 아래 for-each에서 s는 names[0], names[1], ..., names[5]로 반복
		for (String s : names) // 배열 names의 각 문자열을 변수 s에 대입하며 반복
		{
			System.out.print(s + " "); // 현재 저장된 문자열 출력
		}
		
		System.out.println(); // 줄 바꿈
		
		// 아래 for-each에서 day는 월, 화, 수, 목, 금, 토, 일 값으로 반복 
		for (Week day : Week.values()) // Week의 모든 값을 순서대로 day에 대입하며 반복
		{
			System.out.print(day + "요일 "); // 요일 상수와 문자열 결합하여 출력
		}
		
		System.out.println(); // 줄 바꿈

	}

}
