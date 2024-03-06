package t3_application;

public class StudentService2 {
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

	public void print(StudentVO studentVO) {
		String genderOk = genderCheck(studentVO.isGender()); // get
		String ageOk;
		if (ageCheck(studentVO.getAge())) {
			ageOk = "성인";
		} else {
			ageOk = "미성년";
		}
		System.out.println("번호 : " + studentVO.getNo() + ", 성함 : " + studentVO.getName() + ", 나이 : " + studentVO.getAge() + ", 성별 : " + genderOk + ", 직업 : " + studentVO.getJob()
				+ ", 비고 : " + ageOk);
	}
}
