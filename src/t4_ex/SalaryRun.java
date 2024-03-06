package t4_ex;

import java.util.Scanner;

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
public class SalaryRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		SalaryVO sVO = new SalaryVO();
		
		System.out.print("사번을 입력하세요 : ");
		sVO.no = scanner.nextInt();

		System.out.print("성함을 입력하세요 : ");
		sVO.name = scanner.next();
		
		System.out.print("직급 코드를 입력하세요 : ");
		sVO.code = scanner.next();
		
		System.out.print("초과 근무 시간을 입력하세요 : ");
		sVO.overTime = scanner.nextInt();
				
		SalaryService service = new SalaryService();
		service.calculate(sVO);
		
		scanner.close();
	}
}
