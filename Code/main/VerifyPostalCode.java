package nl.roc.testen.Hypotheektool;

public class VerifyPostalCode {
    public boolean postalCode(int postalcode) {
		boolean result = false;
		if (postalcode == 9679 || postalcode == 9681 || postalcode == 9682) {
			result = false;
			return result;
		}
		else {
			result = true;
			return result;
		}
    }
}
