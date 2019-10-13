
public class HumanTest {
	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();
		Human h3 = new Human();
		Human h4 = new Human();
		Human h5 = new Human();
		
		Wizard wizard = new Wizard();
		Ninja ninja = new Ninja();
		Samurai samurai = new Samurai();
		Samurai samurai2 = new Samurai();
		Samurai samurai3 = new Samurai();
		
		h1.attack(h2);
		
		System.out.print("\nH1 Health: " + h1.health);
		System.out.print("\nH2 Health: " + h2.health);
		
		wizard.heal(h2);
		System.out.print("\nH2 Health: " + h2.health);
		
		wizard.fireball(h1);
		System.out.print("\nH1 Health: " + h1.health);
		
		ninja.steal(h3);
		System.out.print("\nH3 Health: " + h3.health);
		System.out.print("\nNinja's Health after Stealing: " + ninja.health);
		
		ninja.runAway();
		System.out.print("\nNinja's Health: " + ninja.health);
		
		System.out.print("\nSamurai's Health: " + samurai.health);
		samurai.deathBowl(h4);
		System.out.print("\nH4 Health: " + h4.health);
		System.out.print("\nSamurai's Health: " + samurai.health);
		
		samurai.meditate();
		System.out.print("\nSamurai's Health: " + samurai.health);
		
		int noOfSamurai = samurai.HowMany();
		System.out.printf("\n\n" + noOfSamurai);
	}
}
