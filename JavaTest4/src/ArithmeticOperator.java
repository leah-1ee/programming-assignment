import java.util.Scanner; // Scanner 클래스 불러오기

public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 키보드 입력받기
		
		System.out.print("정수를 입력하세요: "); // 입력 안내문 출력
		int time = scanner.nextInt(); // 정수 입력
		int second = time % 60; // 60으로 나눈 나머지는 초
		int minute = (time / 60) % 60; // 60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
		int hour = (time / 60) / 60; // 60으로 나눈 몫을 다시 60으로 나눈 몫은 시간
		
		System.out.print(time + "초는 "); // 입력값 출력
		System.out.print(hour + "시간, "); // 시간 출력
		System.out.print(minute + "분, "); // 분 출력
		System.out.println(second + "초입니다."); // 초 출력
		
		scanner.close(); // Scanner 닫기
	}

}
