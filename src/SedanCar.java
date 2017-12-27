
public class SedanCar extends Car {
	
	public SedanCar(String brand) {
		super(brand, "Sedan");
	}

	@Override
	protected boolean checkTyre() {
		System.out.println("car brand:" + this.carBrand + ", car type:" + this.carType + " CheckTyre");
		return true;
	}

	@Override
	protected boolean checkSteeringWheel() {
		System.out.println("car brand:" + this.carBrand + ", car type:" + this.carType + " CheckSteeringWheel");
		return true;
	}

	@Override
	protected boolean checkGasTank() {
		System.out.println("car brand:" + this.carBrand + ", car type:" + this.carType + " CheckGasTank");
		return true;
	}
}
