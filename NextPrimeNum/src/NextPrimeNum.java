/**
 *
 * This program finds prime numbers until the client chooses to stop asking for
 * the next prime number.
 *
 * Stops when a user terminates the program.
 */
public class NextPrimeNum {

	/**
	 * Determines if a number is a prime number
	 * 
	 * @param num
	 *           An arbitrary number
	 * @return A boolean value to which indicates if the number is a prime
	 *         number.
	 */
	private static boolean isPrime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		int num = 0;
		while (true) {
			if (isPrime(num))
				System.out.println(num);
			num++;
		}
	}
}