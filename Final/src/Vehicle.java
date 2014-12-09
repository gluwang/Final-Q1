
public abstract class Vehicle {
	private String Name;
	private String Color;
	private double Weight;
	private Person Owner;
	
	public Vehicle(){
	}
	
	public Vehicle(Person Owner){
		this.Owner = Owner;
	}
	
	public Vehicle(String Name, String Color, double Weight, Person Owner){
		this.Name = Name;
		this.Color = Color;
		this.Weight = Weight;
		this.Owner = Owner;
	}
	
	public Person transferOwnership(Person newOwner){
		Owner = newOwner;
		return Owner;
	}
}