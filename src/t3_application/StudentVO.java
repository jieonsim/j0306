package t3_application;

// Value Object (VO) : 변수 관리하는 객체 (단순 저장, 이동 등)
// Data Transfer Object (DTO) : 데이터를 변환하면서 관리하는 객체
// 자료를 담고 이동할 수 있는 객체. vo랑 dto는 둘다 혼용해서 씀
// VO와 DTO의 차이점 공부해서 카페에 올려보기
public class StudentVO {
	private int no; // private으로 해두면 필드에 직접 접근 불가
	String name;
	int age;
	boolean gender;
	String job;
	
	
	// 받는거는 받아서 저장만 하면 됨, 읽는거는 읽어서 돌려줘야함
	// 홍길동을 저장만할거임 => 읽어서 저장만 하면 됨
	// !! 읽어올 거면 => name에 있는거를 돌려줘야하니까 return이 있어야 함 !!
	// 보통 저장하는 거를 set이라고 하고, 읽어오는거를 get이라고 함
	// 저장하는 객체: setter / 읽어오는 객체 : getter 라고 지정해놓음

	// 규칙 : set or get을 쓴 후 그 뒤에 저장할 필드변수의 대문자로 시작함
	// 마우스 오른쪽 > source > generate Getters and Setters 메뉴에서 쉽게 생성 가능
	// 또는 단축키 알트 + s + r > 알트 + a > 알트 + r
	// 규칙 : boolean의 getter는 get이 아니라 is로 시작함
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
}
