package t5_application_repeat;

public class StudentService {
	String genderCheck(boolean gender) {
		String result = "";
		if (gender) {
			result = "남자";
		} else {
			result = "여자";
		}
		return result;
	}
	
	
	boolean ageCheck(int age) {
		if(age >= 20) {
			return true;
		} else {
			return false;
		}
	}
	
	public void print(StudentVO studentVO) {
		String genderOk = genderCheck(studentVO.isGender());
		String ageOk;
		if(ageCheck(studentVO.getAge())) {
			ageOk = "성인";
		} else {
			ageOk = "미성년";
		}
		System.out.println("번호 : " + studentVO.getNo() + ", 성함 : " + studentVO.getName() + ", 나이 : " + studentVO.getAge() + ", 성별 : " + genderOk + ", 직업 : " + studentVO.getJob() + ", 비고 : " + ageOk);
	}
}
