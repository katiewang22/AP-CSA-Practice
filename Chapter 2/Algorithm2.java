import java.util.Scanner; 

public class Algorithm2 {
	
	public static void main(String args[]) {
		
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// input: Prompt user to enter radius and length
		System.out.print("Enter the radius and length of a cylinder: "); 
		double r = sc.nextDouble();
		double length = sc.nextDouble();
		
		// processing: Plug radius and length into area and volume formula
		double area = r * r * Math.PI;
		double volume = area * length;
		
		// output: Display the results
		System.out.println("The area is " + area); 
		System.out.println("The volume is " + volume); 
	}
}