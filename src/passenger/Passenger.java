package passenger;

public class Passenger {
	private String firstName;
	private String lastName;
	private String passPortId;

	public Passenger(String firstName, String lastName, String passPortId) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.passPortId = passPortId;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public String getPassPortId() {
		return passPortId;
	}

	@Override
	public String toString() {
		return "Passenger [firstName=" + firstName + ", lastName=" + lastName + ", passPortId=" + passPortId + "]";
	}
	
}
