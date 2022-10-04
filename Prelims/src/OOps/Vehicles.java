package OOps;

public abstract class Vehicles {
	abstract void run();
	abstract int mileage();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck t1= new Truck();
		t1.run();
		t1.mileage();
		Bus b1 = new Bus();
		b1.run();
		b1.mileage();
		Car c1 = new Car();
		c1.run();
		c1.mileage();
		Container c11 = new Container();
		c11.run();
		c11.mileage();
	}

}
