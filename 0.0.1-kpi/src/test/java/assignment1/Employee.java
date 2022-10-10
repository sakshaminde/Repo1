package assignment1;

public class Employee implements Salary,Leaves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1 = new Employee();
		E1.personal();
		E1.official();
		E1.salary(45000);
	}

	@Override
	public void official() {
		// TODO Auto-generated method stub
		System.out.println("Official leave like Diwali");
	}

	@Override
	public void personal() {
		// TODO Auto-generated method stub
		System.out.println("Personal leave like for any pain");
	}

	@Override
	public int salary(int a) {
		// TODO Auto-generated method stub
		System.out.println("Salary is: "+a);
		return a;
	}

}
