
import java.util.Random;

// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		Random rand = new Random();
		int randNum = Integer.parseInt(args[0]) + 1;
		int num1 = rand.nextInt(randNum); 
		int num2 = rand.nextInt(randNum);
		int num3 = rand.nextInt(randNum);
		int lowest = Math.min(num1, num2); 
		lowest = Math.min(lowest, num3);
		int highest = Math.max(num1, num2); 
		highest = Math.max(highest, num3);
		int middle = (num1 + num2 + num3) - (highest + lowest);
		System.out.println(num1 + " " + num2 + " " + num3);
		System.out.println(lowest +" " + middle + " " + highest);
	}
}
