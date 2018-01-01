import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
	
	public static void Main(String[] args) throws InterruptedException {
		//创建汽车网络销售平台
		CarSale salePlatform = new CarSale();
		
		//创建零售店A 
		RetailerA ra = new RetailerA();
		
		//创建零售店B
		RetailerB rb = new RetailerB();
		
		Map<String, CarFactory> carFactories = new HashMap<String, CarFactory>();
		//创建Audi工厂
		carFactories.put("audi", new AudiFactory());
		//创建Benz工厂
		carFactories.put("benz", new BenzFactory());
		//创建BMWBMW工厂
		carFactories.put("bmw", new BMWFactory());
		
		//注册网店
		salePlatform.RegisterRetailer(ra);
		salePlatform.RegisterRetailer(rb);
		
		//创建顾客
		Customer customer = new Customer();
		//浏览网店 相当于注册自己
		customer.BrowserCars(salePlatform);
		
		ArrayList<Car> newCars = new ArrayList<Car>();
		while (true) {
			Scanner sc = new Scanner(System.in);
			while (true) {
				String a = sc.next();
				switch (a) {
				case "audi_suv":
					{
						Car car = carFactories.get("audi").CreateCar("SUV");
					}
					break;
				}
			}
			//Thread.sleep(1000);
		}
	}
	
}
