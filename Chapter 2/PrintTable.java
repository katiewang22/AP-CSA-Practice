public class PrintTable {

public static void main(String args[]) {
		
		// declare variables a and b
		float a, b;

		// first row
		System.out.println("a        b        pow(a, b)");

		a = 1;
		b = 2;
		// second row
		System.out.println((int)a + "        " + (int)b + "        " + (int)Math.pow(a, b));

		a++;
		b++;
		// third row
		System.out.println((int)a + "        " + (int)b + "        " + (int)Math.pow(a, b));

		a++;
		b++;
		// fourth row
		System.out.println((int)a + "        " + (int)b + "        " + (int)Math.pow(a, b));
		
		a++;
		b++;
		// fifth row
		System.out.println((int)a + "        " + (int)b + "        " + (int)Math.pow(a, b));

		a++;
		b++;
		// sixth row
		System.out.println((int)a + "        " + (int)b + "        " + (int)Math.pow(a, b));
	}
}