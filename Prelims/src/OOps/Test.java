package OOps;

public abstract class Bike{
	abstract void run();
}
class Test extends Bike
{
	void run() {System.out.println("running Safely");
	}
	public static void main(String[] args)
	{
		Bike obj = new Test();
		Bike obj2 = new Test();
		Bike obj3 = new Test();
		obj2.run();
		obj.run();
		obj3.run();
	}
}
