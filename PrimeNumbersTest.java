import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class PrimeNumbersTest {
	
	public ArrayList<Integer> list(int... nums) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i : nums) {
			ret.add(i);
		}
		return ret;
	}

	@Test
	public void testPrimeNumbersUnderOne() {
		assertEquals(list(), PrimeNumbers.generatePrimeNumbersBelow(1));
	}

	@Test
	public void testPrimeNumbersUnderTwo() {
		assertEquals(list(), PrimeNumbers.generatePrimeNumbersBelow(2));
	}

	@Test
	public void testPrimeNumbersUnderThree() {
		assertEquals(list(2), PrimeNumbers.generatePrimeNumbersBelow(3));
	}

	@Test
	public void testPrimeNumbersUnderFour() {
		assertEquals(list(2, 3), PrimeNumbers.generatePrimeNumbersBelow(4));
	}

	@Test
	public void testPrimeNumbersUnderSix() {
		assertEquals(list(2, 3, 5), PrimeNumbers.generatePrimeNumbersBelow(6));
	}

	@Test
	public void testPrimeNumbersUnderBigNumber() {
		assertEquals(list(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47), PrimeNumbers.generatePrimeNumbersBelow(50));
	}

}
