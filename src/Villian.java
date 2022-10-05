/**
 * 
 */

/**
 * @author pablo
 *
 */
public class Villian extends Player {

	private int specialAT; // variable de ataque especial
	
		public Villian(int life, int armor, int str, int power, int heal) {
		super(life, armor, str, power);
			this.specialAT = specialAT;
		}

		public int getSpecialAT() {
		return specialAT;
		}

		public void setSpecialAT(int specialAT) {
		this.specialAT = specialAT;
		}
	
	
}