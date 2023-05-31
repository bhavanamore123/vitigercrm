class Student
{
	String name;
	String school_name;
	int age;
	int class1;
	double per, total, m1,m2,m3;

	
	Student(String school_name)
	{
		this.school_name = school_name;
	}
	Student(String school_name,String name, int age, int class1 )
	{	
		this(school_name);
		this.name = name;
		this.age = age;
		this.class1 = class1;	
	}	

	void detail(String name, int age, int class1)
	{
		this.name = name;
		this.age = age;
		this.class1 = class1;	
	}

	void marks(double m1, double m2, double m3)
	{	
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;

	}
	
	void basic_display()
	{
		System.out.println("School Name " + school_name);
		System.out.println("Student Name ="+ name);
		System.out.println("Student Age  ="+ age);
	}
	void get_total()
	{
		total = m1 + m2+ m3;

		per = (total*100)/300;

		System.out.println("Hindi "+ m1 + "\n Marathi " + m2 + "\nEnglish "+ m3);
		System.out.println("Total "+total);
		System.out.println("Percentage "+ per);
	
	}
}	
class M
{
	public static void main(String args[])
	{
		Student s = new Student("St. John");
		
		s.detail("Priya", 15, 9);
		s.marks(56,78,56);
		s.basic_display();
		s.get_total();
	
		Student s1 = new Student("Holy Cross", "Riddu", 6, 1);
		s1.marks(20,20,20);
		s1.basic_display();

		


	}
}