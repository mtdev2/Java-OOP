
public class Ninja extends Human {
	
	public Ninja() {
		this.stealth = 10;
	}
	
	public void steal(Human victimHuman) {
		victimHuman.health -= (this.stealth);
		this.health += this.stealth;
		System.out.print("\nStolen sucessfully and the current health of Victim Human is: " + victimHuman.health);
		System.out.print("\nCurrent health of Ninja is: " + this.health);
	}
	
	public void runAway() {
		this.health -= 10;
	}
}
