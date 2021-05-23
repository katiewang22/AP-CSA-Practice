
public class Song {
	
	static int toMoonMiles = 238900;
	static boolean rocketFueled = false;
	static boolean onMoon = false;
	static String threeWords = "I love you";

	public static String youAreAllILongFor(boolean yOrN) {
	
		if (yOrN) {
			return "You are all I long for\n" + "All I worship and adore";
		}
		return "Wait- I'm singing to the wrong person";
	}
	
	public static boolean beTrue() {
		
		if (onMoon) {
			return true;
		}
		return false;
	}
	
	public static void flyMeToTheMoon(String word1, String word2) {
		
		System.out.println("Fly me too the moon");
		String twoLetters = word1.substring(0, 2);
		
		if (twoLetters.equals("st")) {
			String result = "Let me play among the " + twoLetters + "ars";
			System.out.println(result);
			twoLetters = word2.substring(0, 2);
		}
		
		if (twoLetters.equals("sp")) {
			String result = "Let me see what " + twoLetters + "ing is like";
			System.out.println(result);
		}

		System.out.println("On Jupiter and Mars\n");
	}
	
	public static void inOtherWords(int i) {
		
		String phrase = "In other words";
		
		System.out.println(phrase + ", please " + beTrue());
		
		if (i == toMoonMiles) {
			System.out.println(phrase + ", " + phrase.toLowerCase() + "\n" + threeWords);
		} else {
			System.out.println(phrase + ", " + threeWords + "\n");
		}
	}
	
	public static void main (String[] args) {
		
		while (!rocketFueled) {
			flyMeToTheMoon("stars", "spring");
			rocketFueled = onMoon = true;
		}
		
		for (int i = toMoonMiles / 2; i <= toMoonMiles; i *= 2) {
			System.out.println("Fill my heart with song");
			
			if (i == toMoonMiles / 2) {
				System.out.println("And let me sing forevermore");
			} else {
				System.out.println("Let me sing forevermore");
			}
			
			System.out.println(youAreAllILongFor(true));
			inOtherWords(i);
		}
	}
}