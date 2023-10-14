package _07_duck;

 public class Duck {
	
	int numberOfFriends;
	String favoriteFood;
	
	
	Duck (int numberOfFriends, String favoriteFood){
		this.numberOfFriends = numberOfFriends;
		this.favoriteFood = favoriteFood;
	}
	
	void quack() {
		System.out.println("QUAK!");
	}
	
	void waddle() {
		System.out.println("Your duck wandered about.");

	}
	
	
}

class Porcupine{
	
	int quillsLeft;
	String animalName;
	
	Porcupine (String animalName, int quillsLeft) {
		this.quillsLeft = quillsLeft;
		this.animalName = animalName;
	}
	
	public void walk () {
		System.out.println("Your Porcupine shuffled about");

	}
	
	public void shoot (int quillsLeft) {
		quillsLeft =- 3;
		System.out.println("Your porcupine shot" + quillsLeft + " quills");
		

	}
	
}