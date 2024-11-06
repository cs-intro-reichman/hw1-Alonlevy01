// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int x = Integer.parseInt(args[0]) ;
		int hun, tens, ones ;
		ones = x % 10 ;
		x = x - ones ;
		tens = x % 100 / 10 ;
		x = x - tens ;
		hun = x / 100 ;
		System.out.println( hun + " hundreds, " + tens + " tens, and " + ones + " ones.") ;
	}
}
