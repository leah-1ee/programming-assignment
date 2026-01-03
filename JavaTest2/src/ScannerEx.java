import java.util.Scanner; // Scanner 클래스 불러오기

public class ScannerEx { 
	public static void main(String args[]) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요"); // 입력 안내문 출력
		Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
		
		String name = scanner.next(); // 문자열 읽기 
		System.out.print("이름은 " + name + ", "); // 이름 출력
		
		String city = scanner.next(); // 문자열 읽기 
		System.out.print("도시는 " + city + ", "); // 도시 출력
		
		int age = scanner.nextInt(); // 정수 읽기 
		System.out.println("나이는 " + age + ", "); // 나이 출력
		
		double weight = scanner.nextDouble(); // 실수 읽기 
		System.out.println("체중은 " + weight + ", "); // 체중 출력
		
		boolean single = scanner.nextBoolean(); // 논리값 읽기
		System.out.println("독신 여부는 " + single + "입니다."); // 독신 여부 출력
		
		scanner.close(); // scanner 객체 닫기 
		
	} 
} 
