
public class Human {
	
	public int strength;
	public int stealth;
	public int intelligence;
	public int health;
	
	public Human () {
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
	}
	//h2 h1 
	public void attack(Human attackedHuman) {
		attackedHuman.health -= this.strength;
		System.out.printf("\nAttacked another human. \nAttacked human's strength has reduced by 3, current strength level: " + attackedHuman.health);
	}
}



