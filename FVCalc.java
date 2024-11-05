// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double CV = Double.parseDouble(args[0]) ;
		double rate = Double.parseDouble(args[1]) ;
		int years = Integer.parseInt(args[2]) ;
		double adjRate= 1 + (rate / 100);
		double FV = CV*Math.pow(adjRate , years);
		System.out.println("After " + years + " years, " + CV + " saved at " + rate + "% will yield $" + (int) FV);
	}
}