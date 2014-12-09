public class Car extends Vehicle{
	int NumberOfDoors;
	
	public Car(){
		super();
	}
	
	public Car(String Name, String Color, double Weight, Person Owner){
		super(Name, Color, Weight, Owner);
	}
	
	public Car(Person O){
		super(O);
	}
	
	public void setCar(int n){
		NumberOfDoors = n;
	}
	public int getCar(){
		return this.NumberOfDoors;
	}
}