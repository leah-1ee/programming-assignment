import java.util.Scanner;  // Scanner 클래스 불러오기

public class GradingSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  // 키보드 입력받기
		
		char grade;
		System.out.print("점수를 입력하세요(0~100): ");  // 입력 안내문 출력 
		int score = scanner.nextInt();  // 정수 입력 
		switch (score/10) {
			case 10: // score = 100
			case 9: // score는 90~99
				grade = 'A';
				break;
			case 8: // score는 80~89
				grade = 'B';
				break;
			case 7: // score는 70~79
				grade = 'C';
				break;
			case 6: // score는 60~69
				grade = 'D';
				break;
			default: // score는 59 이하
				grade = 'F';
		}
		System.out.println("학점은 "+grade+"입니다");  // 학점 출력 
		scanner.close();  // Scanner 닫기

	}

}
