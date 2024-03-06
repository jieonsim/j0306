package t2_method;

import java.util.Scanner;

public class Test2_3Run {
	public static void main(String[] args) {
		Test2_3 t2 = new Test2_3();
		int res;
		
		t2.mod1();

		res = t2.mod2(50);
		System.out.println("res : " + res);
		
		System.out.println("================");

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요 : ");
		int su1 = sc.nextInt();

		System.out.print("두번째 수를 입력하세요 : ");
		int su2 = sc.nextInt();

		// 덧셈
		t2.add(su1, su2);
		
		// 뺄셈
		t2.sub(su1, su2);

		// 곱셈
		t2.mul(su1, su2);
		
		// 나눗셈
		double res2 = t2.div(su1, su2);
		System.out.printf("%d / %d = %.1f", su1, su2, res2);
		
		sc.close();
	}
}
