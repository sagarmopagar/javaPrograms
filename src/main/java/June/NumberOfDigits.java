package June;

public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	long n = 9;
	//number program
	int noOfDigits = numDigitsCalc(n);
	System.out.println("Number of digits in "+n+" is "+noOfDigits );		
	}
	
	
	public static int numDigitsCalc(long n) {
		if( n == 0) {
			return 0;
		}else {
			return 1 + numDigitsCalc(n/10);
		}
	}

}
