/**
 * 
 */

/**
 * @author pablo
 *
 */
public class Hero extends Player{

	private int heal; //variable de cura
	
	public Hero(int life, int armor, int str, int power, int heal) {
		super(life, armor, str, power);
			this.heal = heal;
	}

	public int getHeal() {
		return heal;
	}

	public void setHeal(int heal) {
		this.heal = heal;
	}
	

}
