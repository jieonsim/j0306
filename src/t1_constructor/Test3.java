package t1_constructor;
// 생성자의 주된 목적은 필드 초기화

public class Test3 {
	// 기본 생성자
	Test3() {} // #1
	
	int atom = 30; // < atom변수가 아니라 atom필드라고 부른다. 초기값은 0이다. 전역변수이기 때문에 다 불러서 쓸 수 있음
	int atom2;
	double atom3;
	
	// 매개변수의 타입 순서 개수를 달리하여 오버로딩 할 수 있음
	Test3(int su1) { // #2
		System.out.println("su1 : " + su1);
	}
	
	Test3(int su1, int su2) { // #3
		atom = su1;
		atom2 = su2;
	} 
		
	// Test2(int atom1, int atom2) {}
	// #3번과 타입과 순서가 같은 생성자가 있기 때문에 이렇게는 생성 불가, 변수명은 관계없음
	
	Test3(int atom, double atom3) { // #4
		this.atom = atom;
		this.atom3 = atom3;
		// 뒤에 있는건 매개변수, 앞에 있는 건 필드임
		// 변수랑 필드는 같은 이름으로 쓰되 앞에는 this.를 붙여서 사용한다
		// this를 적으면 내 클래스에 있는 필드를 가르킴
	} 

	Test3(double su2, int su1) {}
}
