package stringexam;

public class Student implements Cloneable {
	
	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student student1 = new Student(101,"Nagaraju");
		Student student2 = new Student(102,"Sandy");
		System.out.println(student1);
		System.out.println(student2);
		Student student3 = (Student)student1.clone();
		System.out.println(student3);
		
	}


}
