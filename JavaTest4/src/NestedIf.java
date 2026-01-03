import java.util.Scanner;  // Scanner 클래스 불러오기

public class NestedIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  // 키보드 입력받기
		
		System.out.print("점수를 입력하세요(0~100): ");  // 입력 안내문 출력 
		int score = scanner.nextInt();  // 정수 입력 
		
		System.out.print("학년을 입력하세요(1~4): ");    // 입력 안내문 출력 
		int year = scanner.nextInt();   // 정수 입력 
		
		if(score >= 60) { // 60점 이상
			if(year != 4)
				System.out.println("합격!"); // 4학년 아니면 합격
			else if(score >= 70)
				System.out.println("합격!"); // 4학년이 70점 이상이면 합격
		else
			System.out.println("불합격!"); // 4학년이 70점 미만이면 불합격
		}
		else // 60점 미만 불합격
			System.out.println("불합격!");
		
		scanner.close();  // Scanner 닫기

	}

}
