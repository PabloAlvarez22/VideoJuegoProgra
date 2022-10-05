/**
 * 
 */

/**
 * @author PC
 *
 */
public class Boss extends Player {

	private int specialAT; // variable de ataque especial
	
		public Boss(int life, int armor, int str, int power, int specialAT) {
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
