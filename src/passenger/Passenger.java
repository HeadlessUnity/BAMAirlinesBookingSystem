package passenger;

public class Passenger {
	private String firstName;
	private String lastName;
	private int passPortId;
	
	/**
	 * passenger constructor with three parameters
	 * @param firstName
	 * @param lastName
	 * @param passPortId2
	 */
	public Passenger(String firstName, String lastName, int passPortId2) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.passPortId = passPortId2;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getPassPortId() {
		return passPortId;
	}

	// toString method witch takes an passenger object and returns a string
	@Override
	public String toString() {
		return "Passenger [firstName=" + firstName + ", lastName=" + lastName + ", passPortId=" + passPortId + "]";
	}
	
}
