import java.util.Random;

/**
 * 
 */

/**
 * @author pablo
 *
 */
public class Hero extends Player{

	private int heal; //variable de cura
	private int items; //cantidad de items
	private String name; // variable de nombre
	private Random random = new Random(System.nanoTime()); //Randomizador
	
	public Hero(int life, int armor, int str, int power, int heal, int items, String nombre) {
		super(life, armor, str, power);
			this.heal = heal;
			this.items = items;
	}
	
	// getters y setters

	public int getHeal() {
		return heal;
	}

	public void setHeal(int heal) {
		this.heal = heal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getItems() {
		return items;
	}

	public void setItems(int items) {
		this.items = items;
	}

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}
	
	// Métodos de ataque

	public int PhysicalAttack() {
		int randomAT = random.nextInt(3);
		return getStr() * randomAT;
	}
	
	public int ItemSalud(int life, int heal) {
		life = life + heal;
		items = items -1;
		return life;
	}
	
	public int ItemArmadura(int armor, int heal) {
		armor = armor + heal;
		items = items -1;
		return armor;
	}
	
	public int ItemFuerzayMagia(int str, int power, int heal) {
		power = power + 5;
		str = str + 10;
		items = items -1;
		return str;
	}
	
	public int MagicalAttack(int power) {
		if(power > 0){
			power--;
			return power;
		}else {
			return 0;
		}
		
	}
	
	//Método para recibir daño
	
	public void Damage(int life) {
		life -= life;
	}
}
