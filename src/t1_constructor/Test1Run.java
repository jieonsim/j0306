package t1_constructor;

// Test1을 실행할 수 있는 메인 메소드
public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		// 메모리 주소는 16진수로 표기됨
		System.out.println("t1 : " + t1);
		System.out.println("t1 : " + t1.toString());
		// 위 두개는 출력이 같음
	}
}
