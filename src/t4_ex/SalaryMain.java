package t4_ex;

/*
	객체지향형으로 만들기
	사원코드(no), 사원명(name), 직급 코드(code)와 초과 시간(overTime)을 입력받아서 실수령액(netpay)을 계산하시오
	직급 코드 : 부장 - b/B, 과장 - k/K, 대리 - d/D, 사원 - s/S
	1시간당 초과 수당은(sudang) 25,000원
	공제액(gongje)은 (본봉(bonbong) + 초과수당(sudang)의 10%로 한다
	본봉 : 부장 - 5000000 / 과장 = 4000000 / 대리 - 3000000 / 사원 - 2000000
	실수령액 = 본봉 + 수당 - 공제액
	계산부는 비즈니스 로직으로 처리(서비스객체를 사용)
	toUpperCase() : 대문자로 바꿔주는 메소드
	toLowerCase() : 소문자로 바꿔주는 메소드
    j0228/t2_switch_case/class Test5_3 에서 했던 내용들 비슷
*/
import java.util.Scanner;

public class SalaryMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 입력 받기
		System.out.print("사번을 입력해주세요 : ");
		int no = scanner.nextInt();

		System.out.print("성함을 입력해주세요 : ");
		String name = scanner.next();

		System.out.print("직급 코드를 입력해주세요(부장 : B / 과장 : K / 대리 : D / 사원 : S) : ");
		String code = scanner.next();

		System.out.print("초과 근무 시간을 입력해주세요 : ");
		int overTime = scanner.nextInt();

		// 처리
		Employee employee = new Employee(no, name, code, overTime);
		SalaryService service = new SalaryService();
		int netPay = service.calculateNetpay(employee);

		// 출력
		System.out.println(employee.name + "님의 실수령액은 " + netPay + "원 입니다.");

		scanner.close();
	}
}
