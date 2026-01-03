// 예제 3-8 : 배열 원소의 평균 구하기
import java.util.Scanner; // Scanner 클래스 불러오기

public class ArrayLengh {

	public static void main(String[] args) {
		int intArray[] = new int[5]; // 배열의 선언과 생성
		int sum=0; // 배열 원소들의 합계를 저장할 변수를 0으로 초기화
		
		Scanner scanner= new Scanner(System.in); // 입력받기 위한 Scanner 객체 생성
		System.out.print(intArray.length + "개의 정수를 입력하세요>>"); // 배열의 크기(length)를 이용하여 입력 안내 메시지 출력
		
		for(int i=0; i<intArray.length; i++) // 배열의 크기만큼 반복하며 입력 수행
		{
			intArray[i] = scanner.nextInt(); // 키보드에서 입력받은 정수 저장
		}
		
		for(int i=0; i<intArray.length; i++) // 배열의 모든 요소를 순회하며 합계 계산
		{
			sum += intArray[i]; // 배열에 저장된 정수 값을 더하기
		}
		
		System.out.print("평균은 " + (double)sum/intArray.length); // 합계를 배열의 크기로 나누어 평균을 구한 뒤 실수형으로 출력
		scanner.close(); // scanner 객체 닫기

	}

}
