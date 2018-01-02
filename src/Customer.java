
public class Customer {
	
	private int id;
	private CarSale nofifyCarPlatform;
	
	Customer(int id) {
		this.id = id;
	}
	
	//浏览网店 并注册自己
	public void BrowserCars(CarSale carPlatform) {
		carPlatform.RegisterCustomer(this);
	}
	
	public void Notify(CarSale carSale) {
		System.out.println("customer_" + this.id + " notified of new car");
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
	
	public int GetID() {
		return this.id;
	}
}
