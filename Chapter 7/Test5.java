
public class Test5 {
	public static int getSumChars(String[] strArr) {
		int totalChar = 0;
        for (String i : strArr) {
            totalChar += i.length();
        }
        
        return totalChar;
    }

   	public static void main(String[] args) {
   		String[] strArr = {"hi", "bye", "hola"};
        System.out.println(getSumChars(strArr));
    }
}