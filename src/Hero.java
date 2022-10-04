/**
 * 
 */

/**
 * @author pablo
 *
 */
public class Hero extends Player{

	private int heal;
	
	public Hero(int life, int heal) {
		super(life);
			this.heal = heal;
	}

	public int getHeal() {
		return heal;
	}

	public void setHeal(int heal) {
		this.heal = heal;
	}
	

}
