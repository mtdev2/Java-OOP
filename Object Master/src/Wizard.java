
public class Wizard extends Human {

	public Wizard () {
		this.health = 50;
		this.intelligence = 8;
	}
	
	public void heal(Human humanToBeHealed) {
		humanToBeHealed.health += this.intelligence;
		System.out.print("\nHealed by 3 points and the current health of Healed Human is: " + humanToBeHealed.health);
	}
	
	public void fireball(Human humanToBeFireballed) {
		humanToBeFireballed.health -= (this.intelligence * 3);
		System.out.print("\nFireballed sucessfully and the current health of Fireballed Human is: " + humanToBeFireballed.health);
	}
	
}
