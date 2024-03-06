package t4_ex;

public class SalaryService {
	void calculate(SalaryVO sVO) {
		matchCode(sVO);
		if (sVO.bonbong == 0) {
			sVO.netpay = 0;
		} else {
			int total = sVO.bonbong + (sVO.overTime * 25000);
			int gongje = (int) (total * 0.1);
			sVO.netpay = total - gongje;
		}
		printInfo(sVO);
	}

	void matchCode(SalaryVO sVO) {
		String code = sVO.code.toUpperCase();
		switch (code) {
			case "B":
				sVO.position = "부장";
				sVO.bonbong = 5000000;
				break;
			case "K":
				sVO.position = "과장";
				sVO.bonbong = 4000000;
				break;
			case "D":
				sVO.position = "대리";
				sVO.bonbong = 3000000;
				break;
			case "S":
				sVO.position = "사원";
				sVO.bonbong = 2000000;
				break;
			default:
				sVO.position = "비사원";
				sVO.bonbong = 0;
		}
	}

	void printInfo(SalaryVO sVO) {
		System.out.println("사번" + sVO.no + "의 직급은 " + sVO.position + "입니다.");
		System.out.println(
				sVO.position + "의 본봉은 " + sVO.bonbong + "원이며, " + sVO.name + "님의 실수령액은 " + sVO.netpay + "원입니다.");
	}
}
