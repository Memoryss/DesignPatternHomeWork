import java.util.Iterator;

public class RetailerIterator implements Iterator<Car> {
	
	private Car[] cars = null;
	private int position = 0;
	
	RetailerIterator(Car[] cars) {
		this.cars = cars;
	}
	
	@Override
	public boolean hasNext() {
		if (cars == null) {
			return false;
		}
		
		return position < cars.length;
	}

	@Override
	public Car next() {
		if (position >= cars.length) {
			return null;
		}
		
		Car car = cars[position];
		++position;
		return car;
	}
	
}
