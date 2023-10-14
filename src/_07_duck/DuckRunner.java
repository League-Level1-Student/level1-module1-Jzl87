package _07_duck;

public class DuckRunner {
	public static void main(String[] args) {
		Duck daffy = new Duck(3, "bread");
		daffy.quack();
		daffy.waddle();
		
		Porcupine porky = new Porcupine( "PORKY", 400);
		porky.walk();
		porky.shoot(400);
	}
}
