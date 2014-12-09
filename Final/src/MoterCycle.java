
public class MoterCycle extends Vehicle{
	boolean hasSideCar;
	
	public MoterCycle(){
		super();
	}
	public MoterCycle(Person Owner){
		super(Owner);
	}
	public MoterCycle(boolean hasSideCar){
		this.hasSideCar = hasSideCar;
	}
	public boolean getSideCar(){
		return hasSideCar;
	}
}