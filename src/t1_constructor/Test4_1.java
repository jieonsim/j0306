package t1_constructor;

public class Test4_1 {
	// 첫번째 필드를 먼저 생성한다
	String model;
	String color = "블랙";
	int speed;

	// 필드 생성 다음에 생성자 만든다
	// 모델만 고르고 색상과 속도는 기본 설정되어있는 것임
	Test4_1(String model) {
		this.model = model;
		this.color = "흰색";
		this.speed = 250;
	}

	// 모델과 색상을 직접 고를 수 있음. 속도는 고정
	Test4_1(String model, String color) {
		this.model = model;
		this.color = color;
		this.speed = 250;
	}
	
	// 모델과 색상, 속도 모두 커스터 마이징 가능
	Test4_1(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
}
