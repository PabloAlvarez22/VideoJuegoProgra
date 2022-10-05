/**
 * 
 */

/**
 * @author pablo
 *
 */
public class Villian extends Player {

	private int specialAT; // variable de ataque especial
	
		public Villian(int life, int armor, int str, int power, int specialAT) {
		super(life, armor, str, power);
			this.specialAT = specialAT;
		}

		public int getSpecialAT() {
		return specialAT;
		}

		public void setSpecialAT(int specialAT) {
		this.specialAT = specialAT;
		}
	
		public int DamageVillianArmorPhy(int armor, int str) {
				armor = armor - str;
				return armor;
		}
		
		public int DamageVillianLifePhy(int life, int str) {
			life = life - str;
			return life;
		}
		
		public int DamageVillianArmorMag(int armor, int power) {
			armor = armor - power;
			return armor;
		}
	
		public int DamageVillianLifeMag(int life, int power) {
		life = life - power;
		return life;
		}
}