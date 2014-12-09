
public class Truck extends Vehicle{
	double NumberOfAxels;
	
	public Truck(){
		super();
	}
	public Truck(Person Owner) {
		super(Owner);
	}
	public double Axels(double NumberOfAxels){
		this.NumberOfAxels = NumberOfAxels;
		return NumberOfAxels;
	}
}