package thread1;

class StaticDemo1 {
	String name;
	 int rollNo;

	// static variable
	static String cllgName;

	// static counter to set unique roll no
	static int counter = 0;

	public StaticDemo1(String name)
	{
		this.name = name;//initialize the objects

		this.rollNo = setRollNo();//
	}

	// getting unique rollNo
	// through static variable(counter)
	 int setRollNo()
	{
		counter++;
		return counter;
	}

	// static method
	static void setCllg(String name) { cllgName = name; }

	// instance method
	void getStudentInfo()
	{
		System.out.println("name : " + this.name);
		System.out.println("rollNo : " + this.rollNo);

		// accessing static variable
		System.out.println("cllgName : " + cllgName);
	}
}
public class StaticDemo{
	public static void main(String[] args)
	{
		// calling static method
		// without instantiating Student class
		StaticDemo1.setCllg("XYZ");

		StaticDemo1 s1 = new StaticDemo1("Alice");
		StaticDemo1 s2 = new StaticDemo1("Bob");

		s1.getStudentInfo();
		s2.getStudentInfo();
	}
}

