import java.util.ArrayList;
import java.util.Iterator;

//TODO 应该在抽象一层，但是考虑目前只有一个汽车零售店  就不抽象了
public class CarSale {
	private ArrayList<Customer> customers; //顾客
	private ArrayList<Retailer> retailers; //零售店
	private Car newCar = null; //保存下新买进的车
	
	CarSale() {
		customers = new ArrayList<Customer>();
		retailers = new ArrayList<Retailer>();
	}
	
	//注册客户
	public void RegisterCustomer(Customer customer) {
		if (customers.contains(customer)) {
			System.out.println("You have already registered");
			return;
		}
		
		this.customers.add(customer);
	}
	
	//注销客户
	public void UnRegisterCustomer(Customer customer) {
		if (!customers.contains(customer)) {
			System.out.println("You haven't registered yet");
			return;
		}
		
		this.customers.remove(customer);
	}
	
	//注册零售店
	public void RegisterRetailer(Retailer r) {
		if (retailers.contains(r)) {
			System.out.println("You have already registered");
			return;
		}
		
		this.retailers.add(r);
	}
	
	//注销零售店
	public void UnRegisterRetailer(Retailer r) {
		if (!retailers.contains(r)) {
			System.out.println("You haven't registered yet");
			return;
		}
		
		this.retailers.remove(r);
	}
	
	//被通知有新车到货
	public void NotifyNewCar(Car car) {
		this.newCar = car;
		this.NofifyCustomers(car);
	}
	
	//查看所有的car
	public void ViewAllCars() {
		for (int i = 0; i < this.retailers.size(); ++i) {
			Iterator<Car> iter = this.retailers.get(i).CreateIterator();
			while (iter.hasNext()) {
				System.out.println("Brand:" + iter.next().GetBrand() + ", Type:" + iter.next().GetType());
			}
		}
	}
	
	//查看最新的车
	public void ViewNewCar() {
		if (newCar == null) {
			System.out.println("No New Car");
			return;
		}
		
		System.out.println("Brand:" + newCar.GetBrand() + ", Type:" + newCar.GetType());
	}
	
	//通知客户
	protected void NofifyCustomers(Car car) {
		for (int i = 0; i < this.customers.size(); ++i) {
			this.customers.get(i).Notify(this);
		}
	}
}
