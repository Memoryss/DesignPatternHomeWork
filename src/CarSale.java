import java.util.ArrayList;
import java.util.Iterator;

//TODO 应该在抽象一层，但是考虑目前只有一个汽车零售店  就不抽象了
public class CarSale {
	private ArrayList<Customer> customers;
	private ArrayList<Retailer> retailers;
	
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
	
	//通知客户
	public void NofifyCustomers(Car car) {
		for (int i = 0; i < this.customers.size(); ++i) {
			this.customers.get(i).Notify(car);
		}
	}
}
