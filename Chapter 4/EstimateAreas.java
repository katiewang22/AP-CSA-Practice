public class EstimateAreas {
	public static void main(String[] args) {
		
		// City coordinates
		double atlanta1 = Math.toRadians(33.7489954); 
		double atlanta2 = Math.toRadians(-84.3879824); 
		
		double charlotte1 = Math.toRadians(35.2270869); 
		double charlotte2 = Math.toRadians(-80.8431267); 
		
		double savannah1 = Math.toRadians(32.0835407);
		double savannah2 = Math.toRadians(-81.0998342);
		
		double orlando1 = Math.toRadians(28.5383355);
		double orlando2 = Math.toRadians(-81.3792365);
		
		// Calculate the distance ATL to Charlotte
		double dis1 = 6371.01 * Math.acos(Math.sin(atlanta1) * Math.sin(charlotte1) + 
					  Math.cos(atlanta1) * Math.cos(charlotte1) * Math.cos(atlanta2-charlotte2));
		
		// Calculate the distance Charlotte to Savannah
		double dis2 = 6371.01 * Math.acos(Math.sin(charlotte1) * Math.sin(savannah1) + 
					  Math.cos(charlotte1) * Math.cos(savannah1) * Math.cos(charlotte2-savannah2));
		
		// Calculate the distance Savannah to ATL
		double dis3 = 6371.01 * Math.acos(Math.sin(savannah1) * Math.sin(atlanta1) + 
					  Math.cos(savannah1) * Math.cos(atlanta1) * Math.cos(savannah2-atlanta2));
		
		// Distance ATL to Orlando
		double dis4 = 6371.01 * Math.acos(Math.sin(atlanta1) * Math.sin(orlando1) + 
				      Math.cos(atlanta1) * Math.cos(orlando1) * Math.cos(atlanta2-orlando2));
		
		// Distance Orlando to Savannah
		double dis5 = 6371.01 * Math.acos(Math.sin(orlando1) * Math.sin(savannah1) + 
				  	  Math.cos(orlando1) * Math.cos(savannah1) * Math.cos(orlando2-savannah2));
		
		// Calculate area using triangles
		double s1 = (dis1 + dis2 + dis3)/2;
		double area1 = Math.pow(s1 * (s1-dis1) * (s1-dis2) * (s1-dis3), 0.5);
		double s2 = (dis3 + dis4 + dis5)/2;
		double area2 = Math.pow(s2 * (s2-dis3) * (s2-dis4) * (s2-dis5), 0.5);
		double totalArea = area1 + area2;
		
		// Display the result
		System.out.println("The area enclosed by these four cities is: " + totalArea);
	}
}