/**
 * 
 */

/**
 * @author pablo
 *
 */
public class Player {
	
	private int life; // vida del personaje
	private int armor; // armadura del personaje 
	private int str; // fuerza del personaje
	private int power; // poder del personaje
	
	public Player(int life, int armor, int str, int power) {
		this.life = life;
		this.armor = armor;
		this.str = str;
		this.power = power;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	
}
