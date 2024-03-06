package t1_constructor;

public class Test2 {
	// 생성자 오버로딩
	
	
	// 기본 생성자
	Test2() {}
	
	// 매개변수의 타입 순서 개수를 달리하여 오버로딩 할 수 있음
	Test2(int su1) {}
	
	Test2(int su1, int su2) {}
		
	// Test2(int atom1, int atom2) {}
	// 위에 타입과 순서가 같은 생성자가 있기 때문에 이렇게는 생성 불가, 변수명은 관계없음
	
	Test2(int su1, double su2) {}

	Test2(double su2, int su1) {}
}
