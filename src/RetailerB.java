import java.util.ArrayList;
import java.util.Iterator;

public class RetailerB implements Retailer {

	private ArrayList<Car> cars;
	private CarSale carSale; //网络销售平台
	
	RetailerB() {
		this.cars = new ArrayList<Car>();
	}
	
	@Override
	public void ShowCars() {
		for (Car car : this.cars) {
			System.out.println("car brand:" + car.GetBrand() + ", car type:" + car.GetType());
		}
	}

	@Override
	public void BuyCars(Car car) {
		//检测车
		if (!car.Check()) {
			System.out.println("Car check error");
			return;
		}
		
		
		//将车添加进库存中
		cars.add(car);
		
		//通知网上销售平台 有车购入
		notifySalePlatform();
	}
	
	//设置销售平台
	public void SetSalePlatform(CarSale sale) {
		this.carSale = sale;
	}
	
	//通知销售平台 商品信息有变化
	private void notifySalePlatform() {
		if (this.carSale == null) {
			return;
		}
		
		carSale.NotifyNewCar(cars.get(cars.size() - 1));
	}

	@Override
	public Iterator<Car> CreateIterator() {
		return cars.iterator();
	}
}
