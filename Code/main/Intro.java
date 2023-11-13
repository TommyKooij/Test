package nl.roc.testen.Hypotheektool;

import java.util.ArrayList;
import java.util.Scanner;

public class Intro {
	Scanner scanner = new Scanner(System.in);
	
    public Intro() {
    	System.out.println("Vul hier je naam in:");
    	String name = scanner.next();
    	System.out.println("Welkom, " + name + "! Hoeveel geld heb je op je rekening staan:");
    	double bank = scanner.nextDouble();
    	if (bank < 0) {
    		System.out.println("Helaas kunnen wij geen hulp bieden aan mensen met een negatieve rekening!");
    	} else {
    		IntroChoice(bank);	
    	}
    }
    
    public void IntroChoice(double bank) {
    	System.out.println("\nKies wat je nu wilt doen:");
    	String[] choicesIntro = {"1. Rente/maand berekenen", "2. Uitrekenen maximale hypotheek", "3. Hypotheek aanvragen", "4. Laat klanten zien", "5. Ga terug"};
    	for(int i = 0; i < choicesIntro.length; i++) {
    		System.out.println(choicesIntro[i]);
    	}
    	
    	int answer = scanner.nextInt();
    	IntroAnswer(bank, answer);
    }
    
    public void IntroAnswer(double bank, int answer) {
    	switch (answer) {
    	case 1:
    		System.out.println("\nVul hier jouw rentepercentage in:");
    		double rent = scanner.nextDouble();
    		
    		CalculateRentPerMonth rentPerMonth = new CalculateRentPerMonth();
    		double resultRentPerMonth = rentPerMonth.rentPerMonth(bank, rent);
    		System.out.println("Jouw rente per maand is: €" + resultRentPerMonth);
    		
    		IntroChoice(bank);
    	case 2:
    		System.out.println("\nHeeft u een partner? Ja, vul dan hun hypotheek hierin. Zo niet, vul dan 0 in.");
    		double bank2 = scanner.nextDouble();
    		
    		CalculateMortgageWithPartner mortgageWithPartner = new CalculateMortgageWithPartner();
    		double resultMaximumMortgage = mortgageWithPartner.mortgageWithPartner(bank, bank2);
    		System.out.println("Jouw maximale hypotheek is: €" + resultMaximumMortgage);
        
    		IntroChoice(bank);
    	case 3:
        	/* Add maximum of four characters can be used */
        	System.out.println("\nVul hier uw postcode in:");
    		int postalcode = scanner.nextInt();
    		
    		VerifyPostalCode postalCode = new VerifyPostalCode();
    		boolean resultPostalCode = postalCode.postalCode(postalcode);
    		if(resultPostalCode == false) {
    			System.out.println("Hypotheken voor deze gebieden kunnen helaas niet worden aangevraagd!");
    		}
    		else if (resultPostalCode == true) {
    			System.out.println("Uw verzoek is in de wachtrij geplaatst. U hoord zo spoedig mogelijk van ons.");
    		}
    		
    		IntroChoice(bank);
    	case 4:
    		ClientDB clientDB = new ClientDB();
    		ArrayList<Client> clients = clientDB.InitializeClientsDB();
    		clientDB.ShowClientDB(clients);
    		
    		IntroChoice(bank);
    	case 5:
    		System.out.println("");
    		new Intro();
    	default:
    		System.out.println("Geen geldig nummer gevonden!");
    		IntroChoice(bank);
    	}
    }
}
