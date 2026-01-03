// 예제 3-6 : break 문을 이용하여 while 문 벗어나기
import java.util.Scanner; // Scanner 클래스 불러오기

public class BreakExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  // Scanner 객체 생성

		System.out.println("exit을 입력하면 종료합니다."); // 사용자에게 종료 조건을 안내
		while(true) // 무한 반복 수행
		{
			System.out.print(">>"); // 입력 프롬프트 출력
			String text = scanner.nextLine(); // 문자열 한 줄을 입력받아 text 변수에 저장
			
			if(text.equals("exit")) // "exit"이 입력되면 반복 종료
			{
				break; // while 문을 벗어남
			}
			
		}
		
		System.out.println("종료합니다..."); // 프로그램 종료 메시지 출력
		
		scanner.close(); // scanner 객체 닫기

	}

}
