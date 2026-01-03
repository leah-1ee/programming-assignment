import java.util.Scanner;  // Scanner 클래스 불러오기

public class SuccessOrFail {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  // 키보드 입력받기
		
		System.out.print("점수를 입력하시오: ");  // 입력 안내문 출력
		int score = scanner.nextInt();       // 정수 입력
		if (score >= 80)					 // 점수가 80점이 넘으면 
			System.out.println("축하합니다! 합격입니다.");  // 합격 
		
		scanner.close();  // Scanner 닫기

	}

}
