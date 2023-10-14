
package _05_popcorn;

public class PopcornRunner {
	public static void main(String[] args) {
		Microwave microwave = new Microwave();
		Popcorn popcorn = new Popcorn("kettleCorn");
		microwave.putInMicrowave(popcorn);
		microwave.setTime(5);
		microwave.startMicrowave();
	} 
}
