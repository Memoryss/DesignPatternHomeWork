
public class SUVCar extends Car {

	public SUVCar(String brand) {
		super(brand, "SUV");
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
	
	
	@Override
	protected boolean checkConsumption() {
		System.out.println("car brand:" + this.carBrand + ", car type:" + this.carType + " CheckConsumption");
		return true;
	}
}
