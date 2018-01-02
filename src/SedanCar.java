
public class SedanCar extends Car {
	
	public SedanCar(String brand) {
		super(brand, "Sedan");
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
}
