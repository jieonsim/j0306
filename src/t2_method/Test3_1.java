package t2_method;

public class Test3_1 {

	public int hap(int[] su) {
		int hap = 0;
		for (int i = 0; i < su.length; i++) {
			hap += su[i];
		}
		return hap;
	}

	// . . . : 배열을 넘길 때 사용하는 연산자
	// 몇 개를 던질 지 모를 때 사용하면 좋음
	public int sum(int ... su) {
		int sum = 0;
		for (int i = 0; i < su.length; i++) {
			sum += su[i];
		}
		return sum;
	}

}
