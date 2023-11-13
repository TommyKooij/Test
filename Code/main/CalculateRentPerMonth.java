package nl.roc.testen.Hypotheektool;

public class CalculateRentPerMonth {
    public double rentPerMonth(double bank, double rent) {
		double rentPerMonthValue = ((rent/100)/12);
		double rentPerMonth = (bank * rentPerMonthValue);
		return rentPerMonth;
    }
}
