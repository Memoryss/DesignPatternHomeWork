
public class BenzFactory implements CarFactory {

	@Override
	public Car CreateCar(String carType) {
		if (carType.equalsIgnoreCase("SUV")) {
			return new SUVCar("Benz");
		}
		else if(carType.equalsIgnoreCase("Sedan")) {
			return new SedanCar("Benz");
		}
		else {
			return null;
		}
	}


}
