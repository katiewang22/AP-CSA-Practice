
public class PrimeNumber {
	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES = 50;
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		
		int count = 0;
		int number = 2;
		
		int[] primeNumbers = new int[50];
		
		System.out.println("The first 50 prime numbers are \n");
		
		// Compute prime numbers
		while (count < NUMBER_OF_PRIMES) {
			boolean isPrime = true;
			
			//Test whether number is prime
			for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
	            if (number % divisor == 0) {
	            	isPrime = false;
	            	break;
	            }
	        }
			
			// Store prime numbers 
			for (int index = 0; index < NUMBER_OF_PRIMES; index++) {
				primeNumbers[index] = number;
	        }
			
			// Display results
			if (isPrime) {
				count++;
				
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					System.out.println(number);
				} else {
					System.out.print(number + " ");
				}
			}
			
			// Increment number
			number++;
		}
	}
}
