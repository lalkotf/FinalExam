package pkgEmpty;

import static org.junit.Assert.*;

import org.junit.Test;
import pkgCore.Retirement;

public class RetirementTest {

	@Test
	public void RetirementTest1() {
		Retirement retirement = new Retirement();
		retirement.setiYearsToWork(40);
		retirement.setdAnnualReturnWorking(.07);
		retirement.setiYearsRetired(20);	
		retirement.setdAnnualReturnRetired(.02);
		retirement.setdRequiredIncome(10000);
		retirement.setdMonthlySSI(2642);
				
		assertEquals(retirement.AmountToSave(), 554.13, .01);
	}

	@Test
	public void RetirementTest2() {
		Retirement retirement = new Retirement();
		retirement.setiYearsToWork(40);
		retirement.setdAnnualReturnWorking(.07);
		retirement.setiYearsRetired(20);	
		retirement.setdAnnualReturnRetired(.02);
		retirement.setdRequiredIncome(10000);
		retirement.setdMonthlySSI(2642);
		
		assertEquals(retirement.TotalAmountSaved(), 1454485.55, .02);
	}
}
