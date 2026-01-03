// 예제 3-1 : for 문을 이용하여 1부터 10까지 합 출력
public class ForSample {

	public static void main(String[] args) {
		
		int sum=0;  // 합계를 저장할 변수 sum을 0으로 초기화
		
		for(int i=1; i<=10; i++) // 1~10까지 반복
		{ 
			sum += i;  // 현재 i의 값(1~10)을 sum에 더해서 누적
			System.out.print(i); // 더하는 수 출력
			
				if(i<=9) // 1~9까지는 '+' 출력
				{	
					System.out.print("+");
				}
				else  // i가 10인 경우
				{  
					System.out.print("="); // '=' 출력하고
					System.out.print(sum); // 덧셈 결과 출력
				}
			
		}

	}

}
