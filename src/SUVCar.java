
public class SUVCar extends Car {

	public SUVCar(String brand) {
		super(brand, "SUV");
	}

	@Override
	protected boolean checkTyre() {
		System.out.println("CheckTyre OK");
		return true;
	}

	@Override
	protected boolean checkSteeringWheel() {
		System.out.println("CheckSteeringWheel OK");
		return true;
	}

	@Override
	protected boolean checkGasTank() {
		System.out.println("CheckGasTank OK");
		return true;
	}
	
	
	@Override
	protected boolean checkConsumption() {
		System.out.println("CheckConsumption OK");
		return true;
	}
}
