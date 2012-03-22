import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class PrimeFactorizationTests {

	@Test
	public void testPrimeFactorsForOne() {
		assertEquals(list(), PrimeNumbers.generatePrimeFactors(1));
	}
	
	@Test
	public void testPrimeFactorsForTwo() {
		assertEquals(list(2), PrimeNumbers.generatePrimeFactors(2));
	}
	
	public ArrayList<Integer> list(int... nums) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i : nums) {
			ret.add(i);
		}
		return ret;
	}
	
	@Test
	public void testPrimeFactorsForThree() {
		assertEquals(list(3), PrimeNumbers.generatePrimeFactors(3));
	}
	
	@Test
	public void testPrimeFactorsForFour() {
		assertEquals(list(2, 2), PrimeNumbers.generatePrimeFactors(4));
	}
	
	@Test
	public void testPrimeFactorsForSix() {
		assertEquals(list(2, 3), PrimeNumbers.generatePrimeFactors(6));
	}
	
	@Test
	public void testPrimeFactorsForEight() {
		assertEquals(list(2, 2, 2), PrimeNumbers.generatePrimeFactors(8));
	}
	
	@Test
	public void testPrimeFactorsForNine() {
		assertEquals(list(3, 3), PrimeNumbers.generatePrimeFactors(9));
	}
	
	@Test
	public void testPrimeFactorsForBigNumber() {
		assertEquals(list(5, 7, 7, 1327), PrimeNumbers.generatePrimeFactors(325115));
	}

}
