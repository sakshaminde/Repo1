package OOps;

public class Bharatbenz extends Truck{
	int model;
	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Bus run");
	}

	@Override
	int mileage() {
		// TODO Auto-generated method stub
		return 25;
	}
	@Override
	int speed() {
		return 40;
	}
	
}
