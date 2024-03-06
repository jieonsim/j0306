package t2_method;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1_1 = new Test1(); // 기본 생성자. 컴파일러가 자동으로 만들어줌
		System.out.println("t1_1.su1 : " + t1_1.su1);
		System.out.println("t1_1.su2 : " + t1_1.su2);
		System.out.println();

		Test1 t1_2 = new Test1(100);
		System.out.println("t1_1.su1 : " + t1_2.su1);
		System.out.println("t1_1.su2 : " + t1_2.su2);
		System.out.println();

		t1_2.mod1(500);
		t1_2.mod1(500, 600);
		System.out.println("t1_1.su1 : " + t1_2.su1);
		System.out.println("t1_1.su2 : " + t1_2.su2);
		System.out.println();

		t1_1.mod2();
		t1_1.mod2();
		t1_1.mod3();
		t1_1.mod3("김말숙");
		System.out.println("--------------");
		t1_1.mod4("이기자");
		System.out.println();

		for (int i = 0; i < 5; i++) {
			t1_2.mod2();
		}
		System.out.println();

		for (int i = 0; i < 5; i++) {
			t1_2.mod5(i + 1);
		}
		System.out.println();
		
		t1_2.mod6();
	}
}
