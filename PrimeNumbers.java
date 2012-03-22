import java.util.ArrayList;


public class PrimeNumbers {
	public static ArrayList<Integer> generatePrimeFactors(int n) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		
		for (int candidate = 2; n > 1; candidate++) {
			while (n % candidate == 0) {
				factors.add(candidate);
				n /= candidate;
			}
		}
		
		return factors;
	}
	
	public static boolean isPrime(int n) {
		return generatePrimeFactors(n).size() == 1;
	}
	
	public static ArrayList<Integer> generatePrimeNumbersBelow(int n) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		
		return primes;
	}
}
