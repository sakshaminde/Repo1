package Methods;

public class Add1 extends Add{
		int add(int a, int b)
		{
			System.out.println("Method Overriding Body");
			return a+b;
		}
		int sub(int e, int f, int g)
		{
			return e-f+g;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add1 a1 = new Add1();
		Add a2 = new Add();
		a1.add(5,7);
		System.out.println(a1.sub(99, 6, 2));
		System.out.println(a2.add(5, 6));
		System.out.println(a2.add(3, 6, 7));
		System.out.println(a2.sub(10, 6));
	}

}
