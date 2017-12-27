import java.util.Iterator;

public interface Retailer {
	void ShowCars();
	
	//进货
	void BuyCars(Car car);
	
	//创建迭代器
	public Iterator<Car> CreateIterator();
}
