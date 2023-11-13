package nl.roc.testen.Hypotheektool;

public class Client {

	int ID;
	String firstName;
	String lastName;
	int postalCode;
	double currentBalance;

	public Client(int ID, String firstName, String lastName, int postalCode, double currentBalance) {
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.postalCode = postalCode;
		this.currentBalance = currentBalance;
	}
}
