package nl.roc.testen.Hypotheektool;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Unit test for simple App.
 */

@ExtendWith(MockitoExtension.class)
public class AppTest 
{
	@Test
	public void calculateRentPerMonth_UT(){
		double bankTest = 6000;
		double rentTest = 3;
		
		CalculateRentPerMonth calculateRentPerMonth = new CalculateRentPerMonth();
		double testResult = calculateRentPerMonth.rentPerMonth(bankTest, rentTest);

		Assertions.assertTrue(testResult == 15.00);
	}
	
	
	  @Test 
	  public void calculateMortgageWithPartner_UT() { 
		  double bankTestUser = 6000.0; 
		  double bankTestPartner = 3500.0;
	  
		  CalculateMortgageWithPartner calculateMortgageWithPartner = new CalculateMortgageWithPartner();
		  double testResultMortgage = calculateMortgageWithPartner.mortgageWithPartner(bankTestUser,bankTestPartner);
		  
		  Assertions.assertTrue(testResultMortgage == ((bankTestUser + bankTestPartner) * 4.25)); 
		  }
		 
	
	
	  public void verifyPostalCode_UT() { 
		  int postalCode = 6666;
	  
		  VerifyPostalCode verifyPostalCode = new VerifyPostalCode();
		  boolean testResultPostalCode = verifyPostalCode.postalCode(postalCode);
	  
		  Assertions.assertTrue(testResultPostalCode); 
		  }
	 
	
	
	  @Spy CalculateRentPerMonth calculateRentPerMonth;
	  
	  @InjectMocks Intro intro;
	  
	  @Test 
	  public void calculateRentPerMonth(){ 
		  double bankTest = 6000; 
		  double rentTest = 3;
	  
		  double testResult = calculateRentPerMonth.rentPerMonth(bankTest, rentTest);
	  
		  Mockito.verify(calculateRentPerMonth).rentPerMonth(bankTest, rentTest);
		  Assertions.assertTrue(testResult == 15.00); 
		  }
	  
	  @Spy CalculateMortgageWithPartner calculateMortgageWithPartner;
	  
	  @Test 
	  public void calculateMortgageWithPartner() { 
		  double bankTestUser = 6000; 
		  double bankTestPartner = 3500;
	  
		  double testResultMortgage = calculateMortgageWithPartner.mortgageWithPartner(bankTestUser,bankTestPartner);
	  
		  Mockito.verify(calculateMortgageWithPartner).mortgageWithPartner(bankTestUser, bankTestPartner); 
		  Assertions.assertTrue(testResultMortgage ==(bankTestUser + bankTestPartner)); 
		  }
	  
	  @Spy VerifyPostalCode verifyPostalCode;
	  
	  @Test 
	  public void verifyPostalCode() { 
		  int postalCode = 6666;
	  
		  boolean testResultPostalCode = verifyPostalCode.postalCode(postalCode);
	  
		  Mockito.verify(verifyPostalCode).postalCode(postalCode);
		  Assertions.assertTrue(testResultPostalCode); 
		  } 
}
