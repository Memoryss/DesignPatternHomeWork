import java.util.ArrayList;
import java.util.Iterator;

public class RetailerA implements Retailer{

	private Car[] cars;   //汽车数组
	private int carNums; //当前有多少量车
	private CarSale carSale; //网络销售平台
	private Car buyCar;  //最新买进的车
	private int carLimits = 100; //限制当前车库只有100辆车
	
	RetailerA() {
		//假定A销售商只能存100辆车
		this.cars = new Car[carLimits];
		this.carNums = 0;
		this.carSale = null;
	}
	
	@Override
	public void ShowCars() {
		for (int i = 0; i < this.carNums; ++i) {
			System.out.println("car brand:" + this.cars[i].GetBrand() + ", type:" + this.cars[i].GetType());
		}
	}

	@Override
	public void BuyCars(Car car) {
		//超过车库负载， 就不在添加了
		if (carNums >= carLimits) {
			System.out.println("RetailerA has too much cars");
			return;
		}
		
		//检测车
		if (!car.Check()) {
			System.out.println("Car check error");
			return;
		}
		
		//将车添加进库存中
		cars[carNums] = car;
		++carNums;
		
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
		
		this.carSale.NotifyNewCar(cars[carNums-1]);
	}

	@Override
	public Iterator<Car> CreateIterator() {
		return new RetailerIterator(cars);
	}
	
}
