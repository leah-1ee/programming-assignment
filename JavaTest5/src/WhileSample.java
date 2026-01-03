// 예제 3-2 : -1이 입력될 때까지 입력된 수의 평균 구하기 

import java.util.Scanner; // 입력을 받기 위해 Scanner 클래스 가져오기

public class WhileSample {

	public static void main(String[] args) {
		
		int count=0; // count는 입력된 정수의 개수
		int sum=0; // sum은 합
		
		Scanner scanner= new Scanner(System.in); // 키보드 입력을 받기 위한 Scanner 객체 생성
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요."); // 사용자에게 입력 방법 안내 메시지 출력
		
		int n = scanner.nextInt(); // 정수 입력
		while(n != -1)   // -1이 입력되면 while 문 벗어남
		{ 
			sum += n; // 입력받은 정수 n을 합계 변수 sum에 누적
			count++; // 입력받은 정수의 개수 1 증가
			n = scanner.nextInt(); // 정수 입력
		}
		
		if(count == 0) { // 입력된 정수가 하나도 없는지 확인
			System.out.println("입력된 수가 없습니다."); // 입력 데이터가 없을 경우 안내 메시지 출력
		}
		
		else 
		{
			System.out.print("정수의 개수는 " + count + "개이며 "); // 누적된 정수의 총 개수 출력
			System.out.println("평균은 " + (double)sum/count + "입니다."); // 합계를 개수로 나누어 실수형(double)으로 평균 계산 후 출력
		}
		
		scanner.close(); // Scanner 객체 닫기

	}

}
