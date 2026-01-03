import java.util.Scanner;  // Scanner 클래스 불러오기

public class MultipleOfThree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  // 키보드 입력받기
		
		System.out.print("수를 입력하시오: ");  // 입력 안내문 출력 
		int number = scanner.nextInt();     // 정수 입력 
		
		if (number % 3 == 0)					// 3으로 나누어 떨어지면 
			System.out.println("3의 배수입니다.");  // 3의 배수 안내 출력 
		else									// 3으로 나누어 떨어지지 않으면 
			System.out.println("3의 배수가 아닙니다."); // 3의 배수가 아님 출력 
		
		scanner.close();  // Scanner 닫기

	}

}
