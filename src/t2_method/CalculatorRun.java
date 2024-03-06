package t2_method;

import java.util.Scanner;

// 두수와 연산자를 입력하면 해당 결과를 출력하는 프로그램
public class CalculatorRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("첫번째 수를 입력하세요 : ");
			int su1 = sc.nextInt();
			System.out.print("연산자를 입력하세요 : ");
			String operator = sc.next();
			System.out.print("두번째 수를 입력하세요 : ");
			int su2 = sc.nextInt();

			Calculator calculator = new Calculator();
			calculator.calculator(su1, su2, operator);

			System.out.print("계속하시겠습니까?(Y/N) ");
			String answer = sc.next();

//			0번째 인덱스 값을 비교, 비교값이 char타입이기 때문에 '' 으로 이용
//			N이나 n이 아니라면 처음으로 올라가 계속 반복
//			if (answer.charAt(0) == 'N' || answer.charAt(0) == 'n') {
//				break;
//			}
//			
//			if (answer.equals("N") || answer.equals("n")) {
//				break;
//			}
			
//			toUpperCase() : 대문자로 바꿔주는 메소드
//			if (answer.toUpperCase().equals("N")) {
//				break;
//			}
			
			// toLowerCase() : 소문자로 바꿔주는 메소드
			if (answer.toLowerCase().equals("N")) {
				break;
			}
		}
		System.out.println("작업 끝");
		sc.close();

	}
}
