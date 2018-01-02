import java.util.Iterator;

public class RetailerIterator implements Iterator<Car> {
	
	private Car[] cars = null;
	private int position = 0;
	private int size = 0;
	
	RetailerIterator(Car[] cars, int size) {
		this.cars = cars;
		this.size = size;
	}
	
	@Override
	public boolean hasNext() {
		if (cars == null) {
			return false;
		}
		
		return position < this.size;
	}

	@Override
	public Car next() {
		if (position >= this.size) {
			return null;
		}
		
		Car car = cars[position];
		++position;
		return car;
	}
	
}
