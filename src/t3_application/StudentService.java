package t3_application;

public class StudentService {
	void print(int no, String name, int age, boolean gender, String job) {
		// 보내는 애는 타입 없이 변수나 값만 보내면 됨
		String genderOk = genderCheck(gender);
		String ageOk;
		if (ageCheck(age)) { // 이거 자체가 메소드를 호출한거 if(ageCheck(age)) 이 자체가 트루 or 펄스를 구분
			ageOk = "성인";
		} else {
			ageOk = "미성년";
		}
		System.out.println("번호 : " + no + ", 성함 : " + name + ", 나이 : " + age + ", 성별 : " + genderOk + ", 직업 : " + job
				+ ", 비고 : " + ageOk);
	}

	String genderCheck(boolean gender) {
		String res = "";
		// if 안에 결과값은 무조건 true나 false가 오게됨, 그래서 gender = true 말고 그냥 gender라고 써도 됨
		if (gender) {
			res = "남자";
		} else {
			res = "여자";
		}
		return res;
	}

	boolean ageCheck(int age) {
		if (age >= 20) {
			return true;
		} else {
			return false;
		}
	}
}
