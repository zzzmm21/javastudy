package chapter03;

public class Student extends Person {
	private String major;
	private int grade;
	
	public Student() {
		// 자식의 모든 생성자 에서
		// 부모의 특정 생성자를 명시적으로(explicity)하지 않으면
		// 부모의 기본 생성자가 암시적으로 자식 생성자 코드앞에 호출된다.
		// super();
		System.out.println("student asdfwe");
	}
		
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
