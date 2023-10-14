package _04_harry_potter;

public class HarryPotterRunner {
	public static void main(String[] args) {
		HarryPotter wizard = new HarryPotter();
		wizard.makeInvisible(true);
		wizard.spyOnSnape();
		wizard.makeInvisible(false);
		wizard.castSpell("avada kedabra");
		
	}
}
