package tests;
import org.junit.Before;
import org.junit.Test;

import reservation.TheBamVault;

public class BamVaultTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		double d =1000;
		TheBamVault bv =new TheBamVault(d);
		
		bv.printIncome(d);
		bv.printProfit(d);
		
	}

}
