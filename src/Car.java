
public abstract class Car {
	protected String carBrand;  //车的牌子 benz audi bmw
	protected String carType;   //车的类型 suv sedan
	
	public Car(String brand, String type) {
		this.carBrand = brand;
		this.carType = type;
	}
	
	//获取车的牌子
	public String GetBrand() {
		return this.carBrand;
	}
	
	//获取车的种类
	public String GetType() {
		return this.carType;
	}
	
	//检查轮胎
	protected abstract boolean checkTyre();
	
	//检查方向盘
	protected abstract boolean checkSteeringWheel();
	
	//检查油箱
	protected abstract boolean checkGasTank();
	
	//检查耗油情况（SUV）
	protected boolean checkConsumption() {
		return true;
	}
	
	//对汽车进行检查  检查ok返回true， 有问题返回false
	public boolean Check() {
		System.out.println("car brand:" + this.carBrand + ", car type:" + this.carType + " checking:");
		boolean success = true;
		if (!this.checkTyre()) {
			System.out.println("check tyre error");
			success = false;
		}
		
		if (!this.checkSteeringWheel()) {
			System.out.println("check sterringwheel error");
			success = false;
		}
		
		if (!this.checkGasTank()) {
			System.out.println("check gas tank error");
			success = false;
		}
		
		if (!this.checkConsumption()) {
			System.out.println("check consumption error");
			success = false;
		}
				
		return success;
	}
}
