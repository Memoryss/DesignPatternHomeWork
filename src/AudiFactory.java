
public class AudiFactory implements CarFactory {
	
	@Override
	public Car CreateCar(String carType) {
		if (carType.equalsIgnoreCase("SUV")) {
			return new SUVCar("Audi");
		}
		else if(carType.equalsIgnoreCase("Sedan")) {
			return new SedanCar("Audi");
		}
		else {
			return null;
		}
	}
}