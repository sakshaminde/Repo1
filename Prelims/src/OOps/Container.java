package OOps;

public class Container extends Truck{
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
		System.out.println("Container run");
	}

	@Override
	int mileage() {
		// TODO Auto-generated method stub
		return 4;
	}

}
