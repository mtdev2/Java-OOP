
public class Samurai extends Human {
	
	static int numberOfSamurais = 0;
	
	public Samurai () {
		this.health = 200;
		numberOfSamurais += 1;
	}
	
	public void deathBowl (Human humanToBeDeathBowled) {
		humanToBeDeathBowled.health = 0;
		System.out.print("\nSAMURAI Killed the attacked human!!!");
		
		this.health /= 2;
	}
	
	public void meditate() {
		this.health += (this.health * 0.5) ;
	}
	
	public int HowMany() {
		return numberOfSamurais;
	}
}
