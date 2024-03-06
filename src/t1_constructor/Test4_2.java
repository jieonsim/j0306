package t1_constructor;

public class Test4_2 {
	String model;
	String color = "블랙";
	int speed;

	Test4_2(String model) {
		this(model, "흰색", 250);
	}

	Test4_2(String model, String color) {
		this(model, color, 250);
		// model과 color는 내가 선택하고 속도만 250으로 고정
		// 내가 입력해야 하는 값은 this()의 괄호 안에 매개변수명을 넣어주고, 고정값은 값을 직접 준다
	}

	Test4_2(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
}
