import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		//创建汽车网络销售平台
		CarSale salePlatform = new CarSale();
		
		Map<String, Retailer> retailers = new HashMap<String, Retailer>();
		//创建零售店A 
		retailers.put("a", new RetailerA());
		//创建零售店B
		retailers.put("b", new RetailerB());
		//注册网店
		salePlatform.RegisterRetailer(retailers.get("a"));
		salePlatform.RegisterRetailer(retailers.get("b"));
		
		Map<String, CarFactory> carFactories = new HashMap<String, CarFactory>();
		//创建Audi工厂
		carFactories.put("audi", new AudiFactory());
		//创建Benz工厂
		carFactories.put("benz", new BenzFactory());
		//创建BMWBMW工厂
		carFactories.put("bmw", new BMWFactory());
		
		//顾客
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("输入需要创建的顾客个数：");
		int nums = sc.nextInt();
		for (int i = 0; i < nums; ++i) {
			Customer customer = new Customer(i);
			//浏览网店 相当于注册自己
			customer.BrowserCars(salePlatform);
			customers.add(customer);
		}
		
		while (true) {
			String factoryName = new String();
			String carType = new String();
			String retailerType = new String();
			
			System.out.println("输入汽车生产厂家: audi/benz/bmw");
			while (true) {
				String temp = sc.next();
				if (temp.equals("audi") || temp.equals("benz") || temp.equals("bmw")) {
					factoryName = temp;
					break;
				}
				
				System.out.println("请输入 audi/benz/bmw");
			}
			
			System.out.println("输入汽车类型：SUV/Sedan");
			while (true) {
				String temp = sc.next();
				if (temp.equalsIgnoreCase("SUV") || temp.equalsIgnoreCase("Sedan")) {
					carType = temp;
					break;
				}
				
				System.out.println("请输入 SUV/Sedan");
			}
			
			System.out.println("create car, brand:" + factoryName + ", type:" + carType);
			Car car = carFactories.get(factoryName).CreateCar(carType);
			
			System.out.println("输入哪个零售店批发这辆车：a/b");
			while (true) {
				String temp = sc.next();
				if (temp.equals("a") || temp.equals("b")) {
					retailerType = temp;
					break;
				}
				
				System.out.println("请输入 :a/b");
			}
			
			System.out.println(retailerType + " retailer buy this car.");
			retailers.get(retailerType).BuyCars(car);
			
			Iterator<Customer> iter = customers.iterator();
			while (iter.hasNext()) {
				Customer customer = iter.next();
				System.out.println("customer_" + customer.GetID() + " :输入查看新车还是所有的车：new/all");
				while (true) {
					String temp = sc.next();
					if (temp.equalsIgnoreCase("new")) {
						customer.ViewNewCar();
						break;
					}
					else if (temp.equalsIgnoreCase("all")) {
						customer.ViewAllCar();
						break;
					}
					else {
						System.out.println("请输入 :new/all");
					}
				}
			}
			
			System.out.println("继续运行或者结束：yes/no");
			while (true) {
				String temp = sc.next();
				if (temp.equals("yes") || temp.equals("b")) {
					break;
				}
				else {
					return;
				}
			}
			
		}
	}
}
