package nl.roc.testen.Hypotheektool;

public class CalculateMortgageWithPartner {
	public double mortgageWithPartner(double bank, double bank2) {    	
		bank = (bank + bank2);
		double maximumMortgage = (bank * 4.25);
		return maximumMortgage;
    }
}
