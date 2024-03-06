package t2_method;

public class Calculator {
	void calculator(int su1, int su2, String operator) {
		int res;
		if (operator.equals("+")) {
			res = su1 + su2;
		} else if (operator.equals("-")) {
			res = su1 - su2;
		} else if (operator.equals("*")) {
			res = su1 * su2;
		} else if (operator.equals("/")) {
			res = su1 / su2;
		} else {
			System.out.println("+ , -, * , / 연산자만 가능합니다.");
			return;
		}
		prn(su1, su2, res, operator);
	}

	private void prn(int su1, int su2, int res, String operator) {
		System.out.println(su1 + " " + operator + " " + su2 + " = " + res);
	}
}
