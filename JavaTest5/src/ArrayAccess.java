// 예제 3-7 : 배열에 입력받은 수 중 제일 큰 수 찾기 
import java.util.Scanner; // Scanner 클래스 불러오기

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in); // 키보드 입력을 받기 위한 Scanner 객체 생성
		
		int intArray[] = new int[5]; // 정수 5개를 저장할 수 있는 배열 생성
		
		int max=0; // 현재 가장 큰 수를 저장할 변수 0으로 초기화
		System.out.println("양수 5개를 입력하세요.");  // 사용자에게 입력 안내 메시지 출력
		
		for(int i=0; i<5; i++) // 5번 반복 수행
		{
			intArray[i] = scanner.nextInt(); // 입력받은 정수를 배열의 i번째 요소에 저장
			
			if(intArray[i] >max) // 현재 입력받은 값(intArray[i])이 현재 최댓값(max)보다 크다면
			{
				max = intArray[i]; // 최대값(max)을 현재 입력받은 값으로 갱신
			}
			
		}
		
		System.out.print("가장 큰 수는 " + max + "입니다."); // 최종적으로 구해진 가장 큰 수 출력
		  
		scanner.close(); // scanner 객체 닫기

	}

}
