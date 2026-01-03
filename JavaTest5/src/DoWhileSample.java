// 예제 3-3 : a-z까지 출력
public class DoWhileSample {

	public static void main(String[] args) {
		char c = 'a'; // 문자의 초기값을 소문자 'a'로 설정
		
		do {
			System.out.print(c); // 현재 저장된 문자 c를 화면에 출력
			c = (char) (c + 1); // 문자의 아스키 코드값을 1 증가시켜 다음 알파벳으로 변경 (형변환)
		} while (c <= 'z'); // 변수 c가 'z'보다 작거나 같을 동안 반복 실행

	}

}
