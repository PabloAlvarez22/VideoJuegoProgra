/**
 * 
 */

/**
 * @author PC
 *
 */
public class Boss extends Player {

	private int specialAT; // variable de ataque especial
	private int specialLife; // variable de vida especial
	private String phrases; // variable de frases
	private int telequinesis; //variable de daño telequinetico
	
		public Boss(int life, int armor, int str, int power, int specialAT, int speciaLife, int telequinesis, String phrases) {
		super(life, armor, str, power);
			this.specialAT = specialAT;
		}

		public int getSpecialAT() {
		return specialAT;
		}

		public void setSpecialAT(int specialAT) {
		this.specialAT = specialAT;
		}

		public int getSpecialLife() {
			return specialLife;
		}

		public void setSpecialLife(int specialLife) {
			this.specialLife = specialLife;
		}

		public String getPhrases() {
			return phrases;
		}

		public void setPhrases(String phrases) {
			this.phrases = phrases;
		}

		public int getTelequinesis() {
			return telequinesis;
		}

		public void setTelequinesis(int telequinesis) {
			this.telequinesis = telequinesis;
		}
	
	
}
