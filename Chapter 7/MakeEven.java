
public class MakeEven {
	public static int[ ] makeEven(int[ ] num) {
	    int[ ] num2 = new int[num.length];
	    int n = 0;

	    for (int i = 0; i < num.length; i++) {
	    	if (num[i] % 2 == 1) {
	    		num2[n] = num[i] * 2;
	    	} else {
	    		num2[n] = num[i];
	    	}
	      	n++;
	    }

	    System.out.println(num2[2]);
	    return num2;
	  }


	  public static void main(String[] args) {
	    int[] arr = {1,2,3,4};
	    makeEven(arr);
	  }
}
