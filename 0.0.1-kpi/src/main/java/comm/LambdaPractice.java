package comm;

public class LambdaPractice {
	private int operate(int a, int b, MathOperation mo)
	{
		return mo.operation(a, b);
	}
	public int substraction(int a, int b) {return a-b;}
	public int multiplication(int a, int b) {return a*b;}
	public int division(int a, int b) {return a/b;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaPractice tester = new LambdaPractice();
		MathOperation addition = (int a, int b) -> a+b;
		MathOperation substraction = (a,b) -> a-b;
		MathOperation multiplication = (a,b) ->  a*b;
		MathOperation division = (int a, int b) -> a/b;
		System.out.println(tester.operate(20,2,addition));
		System.out.println(tester.operate(15,4,substraction));
		System.out.println(tester.operate(20,2,multiplication));
		System.out.println(tester.operate(20,2,division));
	}

}
