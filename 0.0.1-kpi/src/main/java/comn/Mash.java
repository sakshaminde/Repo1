package comn;

import java.util.ArrayList;
import java.util.List;
public class Mash implements Abhitayu{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List Stud = new ArrayList();
		Stud.add("Mahesh");
		Stud.add("Ramesh");
		Stud.add("Ganesh");
		Stud.add(1);
		Stud.add(3);
		System.out.println(Stud);
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("Iam Mashir");
	}

}
