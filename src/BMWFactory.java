
public class BMWFactory implements CarFactory {

	@Override
	public Car CreateCar(String carType) {
		if (carType.equalsIgnoreCase("SUV")) {
			return new SUVCar("BMW");
		}
		else if(carType.equalsIgnoreCase("Sedan")) {
			return new SedanCar("BMW");
		}
		else {
			return null;
		}
	}

}
