package t2_method;

// static 선언한 것들은 메소드 영역에 만들어짐
// 자주쓰는 메소드 static 붙이면 된다..?
// 메인 메소드에서 객체 생성 시 반드시 static이 붙인 메소드를 만들어야한다

public class Test3_1Run {
	public static void main(String[] args) {
		int[] su = { 90, 80, 100, 70, 60 };

		Test3_1 t3 = new Test3_1();

		int res = t3.hap(su);
		System.out.println("총합 : " + res);

		res = t3.sum(su);
		System.out.println("총합2 : " + res);

		// 이렇게 해도 됨
		res = t3.hap(new int[] { 1, 2, 3, 4, 5 });
		System.out.println("총합3 : " + res);

		res = t3.sum(new int[] { 1, 2, 3, 4, 5 });
		System.out.println("총합4 : " + res);

		// res = t3.hap({1,2,3,4,5}); (X) 이건 안됨. new int[] 이런식으로 생성해야함
		// res = t3.hap(1,2,3,4,5); (X)

		res = t3.sum(1, 2, 3, 4, 5);
		System.out.println("총합5 : " + res);

	}
}
