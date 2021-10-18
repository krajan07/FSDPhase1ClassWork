package ClassWork;

class Teacher {
	private String designation = "Teacher";
	private String colleageName = "Simplilearn";
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getColleageName() {
		return colleageName;
	}
	public void setColleageName(String colleageName) {
		this.colleageName = colleageName;
	}
	
	void does() {
		System.out.println("Teaching");
	}
	
}

public class oopsInheritance1 extends Teacher {
	static String mainSubject = "Full Stack Development";
	public static void main(String[] args) {
		oopsInheritance1 ob1 = new oopsInheritance1();
		System.out.println(ob1.getDesignation());
		System.out.println(ob1.getColleageName());
		System.out.println(mainSubject);
		ob1.does();
	}

}
