
public class Customer {
	
	private CarSale nofifyCarPlatform;
	
	//浏览网店 并注册自己
	public void BrowserCars(CarSale carPlatform) {
		carPlatform.RegisterCustomer(this);
	}
	
	public void Notify(CarSale carSale) {
		nofifyCarPlatform = carSale;
	}
	
	public void ViewNewCar() {
		if (nofifyCarPlatform == null) {
			System.out.println("No Car Sale Platform");
			return;
		}
		
		nofifyCarPlatform.ViewNewCar();
	}
	
	public void ViewAllCar() {
		if (nofifyCarPlatform == null) {
			System.out.println("No Car Sale Platform");
			return;
		}
		
		nofifyCarPlatform.ViewAllCars();
	}
}
