package t5_application_repeat;

import java.util.Scanner;

public class StudentRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		StudentVO studentVO = new StudentVO();

		System.out.print("번호를 입력하세요 : ");
		studentVO.setNo(scanner.nextInt());

		System.out.print("성함을 입력하세요 : ");
		studentVO.setName(scanner.next());

		System.out.print("나이를 입력하세요 : ");
		studentVO.setAge(scanner.nextInt());

		System.out.print("성별을 입력하세요(1:남자, 2:여자) : ");
		int choice = scanner.nextInt();

		if (choice == 1) {
			studentVO.setGender(true);
		} else {
			studentVO.setGender(false);
		}
		
		System.out.print("직업을 입력하세요 : ");
		studentVO.setJob(scanner.next());
		
		StudentService studentService = new StudentService();
		studentService.print(studentVO);
		
		System.out.println("수고하셨습니다.");
		
		scanner.close();
	}
}
