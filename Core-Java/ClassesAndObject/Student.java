package ClassesAndObject;

public class Student {

	int rollNumber ;
	String name;
	double phy, cem, maths, total, percentage;
	
	public Student()
	{
		rollNumber = 101;
		name = "Nagaraju";
		phy = 70;
		cem = 80;
		maths = 90;
	}
	
	public Student(int rollNo, String nm, double p, double c, double m)
	{
		rollNumber = rollNo;
		name = nm;
		phy = p;
		cem = c;
		maths = m;
	}
	
	public void calculate()
	{
		total = phy + cem + maths;
		percentage = total / 3;
		System.out.println("Roll Number : "+rollNumber);
		System.out.println("Name : "+name);
		System.out.println("Total : "+total);
		System.out.println("Percentage : "+percentage);
	}
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.calculate();
		
		Student student2 = new Student(102, "Sandy", 75, 85, 95);
		student2.calculate();
		
	}

}
