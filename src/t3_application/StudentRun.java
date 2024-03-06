package t3_application;

import java.util.Scanner;

public class StudentRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int no;
		String name;
		int age;
		boolean gender;
		String job;
		int choice;

		System.out.print("번호를 입력하세요 : ");
		no = scanner.nextInt();
		System.out.print("성함를 입력하세요 : ");
		name = scanner.next();
		System.out.print("나이를 입력하세요 : ");
		age = scanner.nextInt();
		System.out.print("성별을 입력하세요(1:남자, 2:여자) : ");
		choice = scanner.nextInt();
		if (choice == 1) {
			gender = true;
		} else {
			gender = false;
		}
		System.out.print("직업을 입력하세요 : ");
		job = scanner.next();
		
		StudentService studentService = new StudentService();
		studentService.print(no, name, age, gender, job);
		
		System.out.println("수고하셨습니다.");
		
		scanner.close();
	}
}
