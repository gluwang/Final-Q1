import java.util.UUID;

public class Person {
	private String FirstName;
	private String LastName;
	private UUID PersonID;
	
	public Person(){
	}
	
	public void setFirstName(String FirstName){
		this.FirstName = FirstName;
	}
	public String getFirstName(){
		return this.FirstName;
	}
	public void setLastName(String LastName){
		this.LastName = LastName;
	}
	public String getLastName(){
		return this.LastName;
	}
	public void setPersonID(UUID PersonID){
		this.PersonID = PersonID;
	}
	public UUID getPersonID(){
		return this.PersonID;
	}
}