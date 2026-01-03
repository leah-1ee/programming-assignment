// 예제 3-5 : continue 문을 이용하여 양수 합 구하기
import java.util.Scanner; // Scanner 클래스 불러오기

public class ContinueExample {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in); // Scanner 객체 생성
		
		System.out.println("정수를 5개 입력하세요."); // 사용자에게 입력 안내 메시지 출력
		int sum=0; // 합계를 저장할 변수 0으로 초기화
		
		for(int i=0; i<5; i++) // 5번 반복 수행
		{
			int n = scanner.nextInt(); // 정수 입력
			
			if(n<=0)  // 입력받은 수가 0보다 작거나 같으면(양수가 아니면)
			{ 
				continue; // 양수가 아닌 경우 다음 반복으로 진행
			}
			else // 양수일 경우
			{
				sum += n; // 양수인 경우 덧셈
			}
		}
		
		System.out.println("양수의 합은 " + sum); // 계산된 양수의 총합 출력
		
		scanner.close(); // scanner 객체 닫기

	}

}
