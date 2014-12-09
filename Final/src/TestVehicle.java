
public class TestVehicle {
	public static void main(String[] arg){
		Person a = new Person();
		Car car = new Car(a);
		car.setCar(4);
		
		Truck truck1 = new Truck(a);
		truck1.Axels(2);
		
		Person b = new Person();
		truck1.transferOwnership(b);
		
		MoterCycle moter1 = new MoterCycle(false);
		
	}
}