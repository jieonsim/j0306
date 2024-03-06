package t2_method;

public class Test2_3 {
	void mod1() {
		System.out.println("안녕");
	}

	int mod2(int su1) {
		// void가 아닐 경우 반드시 return이 있어야함
		// return 10; 이렇게 직접 주거나 아래 처럼 변수로 줘도 됨
		return su1;
	}

	int mod1(int su1) {
		return su1;
	}

	// 덧셈
	void add(int su1, int su2) {
		// return su1 + su2;
		prn(su1, su2, (su1 + su2), "+");
	}

	// 뺄셈
	void sub(int su1, int su2) {
		int res = su1 - su2;
		prn(su1, su2, res, "-");
	}

	// 곱셈
	void mul(int su1, int su2) {
		int res = su1 * su2;
		prn(su1, su2, res, "*");
	}

	// 나눗셈
	double div(int su1, int su2) {
		return (double) su1 / su2;
	}

	// 출력
	void prn(int su1, int su2, int res, String operator) {
		System.out.println(su1 + operator + su2 + " = " + res);
	}
}
