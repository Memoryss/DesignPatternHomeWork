
public class Test {
	
	public static void Main(String[] args) {
		//创建汽车网络销售平台
		CarSale salePlatform = new CarSale();
		
		//创建零售店A 
		RetailerA ra = new RetailerA();
		
		//创建零售店B
		RetailerB rb = new RetailerB();
		
		//创建Audi工厂
		AudiFactory audiFac = new AudiFactory();
		
		//创建Benz工厂
		BenzFactory benzFac = new BenzFactory();
		
		//创建BMW工厂
		BMWFactory bmwFac = new BMWFactory();
		
		//创建网店
		salePlatform.RegisterRetailer(ra);
		salePlatform.RegisterRetailer(rb);
		
		
		while (true) {
			
		}
	}
	
}
