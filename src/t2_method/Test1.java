package t2_method;

// 메소드 오버로딩
// 같은 이름의 메소드를 구분하기 위해 매개변수의 타입, 개수, 순서를 달리하는 것
public class Test1 {
	int su1;
	double su2;
	String name = "홍길동";

	// 컨트롤 + 스페이스바 누르면 컴파일러가 기본 생성자 알아서 만들어줌
	public Test1() {

	}

	Test1(int su1) {
		this.su1 = su1;
	}

	void mod1() {

	}

	void mod1(int su1) {
		this.su1 = su1;
	}

	void mod1(int su1, double su2) {
		this.su1 = su1;
		this.su2 = su2;
	}

	void mod2() {
		System.out.println("안녕하세요.");
	}

	void mod3() {
		// System.out.println(this.name + "님 안녕하세요.");
		System.out.println(name + "님 안녕하세요.");
		// this를 안붙여도 실행블럭 안에 있는 같은 필드명 name으로 찾아감
	}

	void mod3(String name) {
		System.out.println(name + "님 안녕하세요.");
	}

	void mod4(String name) {
		System.out.println(this.name + "님 안녕하세요.");
		System.out.println(name + "님 안녕하세요.");
	}
	
	void mod5(int i) {
		System.out.println(i + ". 안녕하세요.");
	}
	
	// 3의 배수가 되면 메소드를 종료하세요
	void mod6() {
		int i = 0;
		while (i < 5) {
			i++;
			System.out.println(i + ". 안녕하세요.");
			/*if (i % 3 == 0) {
				break;
			}
			*/
			if (i % 3 == 0) {
				return;
			}
			
			System.out.println("작업 중");
		}
		System.out.println("작업 끝");
	}
}
