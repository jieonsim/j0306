package t4_ex;

public class SalaryService {
	int calculateNetpay(Employee employee) {
		int bonbong = 0;
		int sudang = employee.overTime * 25000; // 초과 수당 계산

		// 직급 코드에 따른 본봉
		switch (employee.code) {
		case "B":
			bonbong = 5000000;
			break;
		case "K":
			bonbong = 4000000;
			break;
		case "D":
			bonbong = 3000000;
			break;
		case "S":
			bonbong = 2000000;
			break;
		default:
			System.out.println("존재하지 않는 직급 코드입니다.");
			return 0;
		}
		
		// 공제액 및 실수령 계산 후 리턴
		int gongje = (int) ((bonbong + sudang) * 0.1);
		return (bonbong + sudang - gongje);
	}
}
