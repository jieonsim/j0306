package t1_constructor;

public class Test3Run {
	public static void main(String[] args) {
		Test3 t3_1 = new Test3();
		Test3 t3_2 = new Test3(100);
		
		System.out.println("t3_1.atom : " + t3_1.atom);
		System.out.println("t3_2.atom : " + t3_2.atom);
		
		t3_1.atom = 500;
		System.out.println("t3_1.atom : " + t3_1.atom);
		System.out.println("t3_2.atom : " + t3_2.atom);
		// t3_1, t3_2 는 서로 다른 객체이기 때문에 t3_1.atom = 500;이 t3_2.atom에 영향을 주지 않는다
		
		t3_2.atom = 600;
		System.out.println("t3_1.atom : " + t3_1.atom);
		System.out.println("t3_2.atom : " + t3_2.atom);
		System.out.println();
		
		Test3 t3_3 = new Test3(10, 20);
		System.out.println("t3_3.atom : " + t3_3.atom);
		System.out.println("t3_3.atom : " + t3_3.atom2);
		System.out.println();
		
		// 웹(네트워크)상에서는 이 방법보다는 위에 방법을 더 권장
		t3_3.atom = -100;
		t3_3.atom2 = -200;
		System.out.println("t3_3.atom : " + t3_3.atom);
		System.out.println("t3_3.atom : " + t3_3.atom2);
		System.out.println();
		
		Test3 t3_4 = new Test3(70, 3.14);
		System.out.println("t3_4.atom : " + t3_4.atom);
		System.out.println("t3_4.atom : " + t3_4.atom3);
	}
}
