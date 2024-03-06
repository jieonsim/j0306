package t4_ex;

public class Employee {
	int no;
	String name;
	String code;
	int overTime;
	
	public Employee(int no, String name, String code, int overTime) {
		this.no = no;
		this.name = name;
		this.code = code.toUpperCase();
		this.overTime = overTime;
	}
}
