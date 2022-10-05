/**
 * 
 */
import java.util.random.*;
import java.util.Random;
import java.util.Scanner;
/**
 * @author pablo
 *
 */
public class Game {
	
	int opcion;
	static Scanner entrada = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Variables a utilizar
		int player;
		int vida;
		
		int healthG = 100, armaduraG = 100;
		int healthMag = 100, armaduraMag = 50;
		int healthE = 100, armaduraE = 50;
		int healthAs = 100, armaduraAs = 50;
		int healthT = 300, armaduraT = 300;
		
		int healthM = 100, armaduraM = 100;
		int healthA = 150, armaduraA = 150;
		int healthD = 200, armaduraD = 200;
		
		int cure = 10, cureE = 15;
		int opcionjuego;
		boolean heros = true, villians = true;
		int opcion = 0;

		// Menú principal
		
	        while(opcion!=3){
	    		
	    	    System.out.println("BIENVENIDO AL JUEGO DEL SIGLO");
	            System.out.println("¿QUIERES JUGAR?");
	            System.out.println("1. Iniciar juego");
	            System.out.println("2. Cerrar Juego");
	            opcion = entrada.nextInt();	
	            
	        	
	            switch(opcion) {
	            case 1:
	            	System.out.println("Cargando...");
	            	
	            	//Las distintas clases
	            	
	            	Hero Guerrero = new Hero(100, 100, 10, 5, 10, 5, "Gerardo");
	            	Hero Mago = new Hero(100, 50, 20, 5, 10, 5, "Gertrudis");
	            	Hero Explorador = new Hero(100, 50, 50, 200, 10, 15, "Link");
	            	Hero Asesino = new Hero(100, 50, 40, 2, 10, 5, "Jack");
	            	Hero Tanque = new Hero(300, 300, 5, 5, 10, 5, "Gibraltar");
	            	
	            	Villian Monstruo = new Villian(100, 100, 20, 10, 25);
	            	Villian Alien = new Villian(150, 150, 150, 20, 35);
	            	Villian Demonio = new Villian(200, 50, 50, 200, 50);
	            	
	            	
	            	System.out.println("Elije inteligentemente a tu personaje (cada personaje cuenta con distintos atributos");
	            	System.out.println("1. Guerrero Gerardo (Personaje con buena vida, resistencia y ataque físico)");
	            	System.out.println("2. Maga Gertudris (Personaje con buena vida, poca resistencia y excelente ataque mágico)");
	            	System.out.println("3. Explorador Link (Personaje con buena curación y más items)");
	            	System.out.println("4. Asesino Jack (Personaje con poca resistencia, pero excelente ataque físico)");
	            	System.out.println("5. Tanque Gibraltar (Personaje con vida y resistencia excelente, pero poco daño)");
	            	player = entrada.nextInt();
	            	
	            	//Todos los jugadores disponibles y sus distintos ataques y derribos.
	            	
	            	if (player==1) {
            			System.out.println("Un monstruo se avecina");
	            		do {            			
		            		System.out.println("Para poder combatir deberá elegir que hacer");
		            		System.out.println("1. Ataque físico");
		            		System.out.println("2. Ataque Mágico");
		            		System.out.println("3. Item de curación");
		            		System.out.println("4. Item de escudo");
		            		opcionjuego = entrada.nextInt();
		            		
		            		if(opcionjuego==1) {
		            			vida = Guerrero.PhysicalAttack(Mago.getStr()); 
		            			System.out.println("Has dado un golpe de " + Guerrero.getStr() + " de daño físico");
		            			if (armaduraM > 0) {
		            				Monstruo.DamageVillianArmorPhy(Monstruo.getArmor(), Guerrero.getStr());
			            			armaduraM = armaduraM - 10;
			            			System.out.println("Armadura en: " + armaduraM);
		            			} else {
		            				System.out.println("Monstruo sin armadura");
		            				if (healthM > 0) {
		            					Monstruo.DamageVillianLifePhy(Monstruo.getLife(), Guerrero.getStr());
			            				healthM = healthM - 10;
			            				System.out.println("Vida del enemigo en: " + healthM);
			            			} else {
			            				System.out.println("Monstruo asesinado");
			            				villians = false;
			            			}
		            			}
		            		} 
		            		if(opcionjuego==2) {
		            			vida = Guerrero.MagicalAttack(Guerrero.getPower()); 
		            			System.out.println("Has dado un golpe de " + Guerrero.getPower() + " de daño mágico");
		            			if (armaduraM > 0) {
		            				Monstruo.DamageVillianArmorMag(Monstruo.getArmor(), Guerrero.getPower());
			            			armaduraM = armaduraM - 5;
			            			System.out.println("Armadura en: " + armaduraM);
		            			} else {
		            				System.out.println("Monstruo sin armadura");
		            				if (healthM > 0) {
		            					Monstruo.DamageVillianLifeMag(Monstruo.getLife(), Guerrero.getPower());
			            				healthM = healthM - 5;
			            				System.out.println("Vida del enemigo en: " + healthM);
			            			} else {
			            				System.out.println("Monstruo asesinado");
			            				villians = false;
			            			}
		            			}
		            		} 
		            		if(opcionjuego==3) {
		            			vida = Guerrero.ItemSalud(100, 10); 
		            			if (healthG < 100) {
			            			System.out.println("Te has recuperado 10 de vida");
			            			healthG = healthG + cure;
		            			} else {
		            				System.out.println("No puedes curarte más");
		            			}
		            		}
		            		if(opcionjuego==4) {
		            			vida = Guerrero.ItemArmadura(100, 10); 
		            			if (armaduraG < 100) {
			            			System.out.println("Te has recuperado 10 de armadura");
			            			armaduraG = armaduraG + cure;
		            			} else {
		            				System.out.println("No puedes curarte más");
		            			}
		            		} 
		            	}while(heros && villians);
	            	}

	            	if (player==2) {
            			System.out.println("Un demonio se avecina");
	            		do {            			
		            		System.out.println("Para poder combatir deberá elegir que hacer");
		            		System.out.println("1. Ataque físico");
		            		System.out.println("2. Ataque Mágico");
		            		System.out.println("3. Item de curación");
		            		System.out.println("4. Item de escudo");
		            		opcionjuego = entrada.nextInt();
		            		
		            		if(opcionjuego==1) {
		            			vida = Mago.PhysicalAttack(Mago.getStr()); 
		            			System.out.println("Has dado un golpe de " + Mago.getStr() + " de daño físico");
		            			if (armaduraD > 0) {
		            				Demonio.DamageVillianArmorPhy(Demonio.getArmor(), Mago.getStr());
			            			armaduraD= armaduraD - 10;
			            			System.out.println("Armadura en: " + armaduraD);
		            			} else {
		            				System.out.println("Monstruo sin armadura");
		            				if (healthD > 0) {
		            					Demonio.DamageVillianLifePhy(Demonio.getLife(), Mago.getStr());
			            				healthD = healthD - 10;
			            				System.out.println("Vida del enemigo en: " + healthD);
			            			} else {
			            				System.out.println("Monstruo asesinado");
			            				villians = false;
			            			}
		            			}
		            		} 
		            		if(opcionjuego==2) {
		            			vida = Mago.MagicalAttack(Mago.getPower()); 
		            			System.out.println("Has dado un golpe de " + Mago.getPower() + " de daño mágico");
		            			if (armaduraD > 0) {
		            				Demonio.DamageVillianArmorMag(Demonio.getArmor(), Mago.getPower());
			            			armaduraD = armaduraD - 5;
			            			System.out.println("Armadura en: " + armaduraD);
		            			} else {
		            				System.out.println("Monstruo sin armadura");
		            				if (healthD > 0) {
		            					Demonio.DamageVillianLifeMag(Demonio.getLife(), Mago.getPower());
			            				healthD = healthD - 5;
			            				System.out.println("Vida del enemigo en: " + healthD);
			            			} else {
			            				System.out.println("Monstruo asesinado");
			            				villians = false;
			            			}
		            			}
		            		} 
		            		if(opcionjuego==3) {
		            			vida = Mago.ItemSalud(100, 10); 
		            			if (healthMag < 100) {
			            			System.out.println("Te has recuperado 10 de vida");
			            			healthMag = healthMag + cure;
		            			} else {
		            				System.out.println("No puedes curarte más");
		            			}
		            		}
		            		if(opcionjuego==4) {
		            			vida = Mago.ItemArmadura(100, 10); 
		            			if (armaduraMag < 100) {
			            			System.out.println("Te has recuperado 10 de armadura");
			            			armaduraMag = healthMag + cure;
		            			} else {
		            				System.out.println("No puedes curarte más");
		            			}
		            		} 
		            	}while(heros && villians);
	            	}
	            	if (player==3) {
            			System.out.println("Un monstruo se avecina");
	            		do {            			
		            		System.out.println("Para poder combatir deberá elegir que hacer");
		            		System.out.println("1. Ataque físico");
		            		System.out.println("2. Ataque Mágico");
		            		System.out.println("3. Item de curación");
		            		System.out.println("4. Item de escudo");
		            		opcionjuego = entrada.nextInt();
		            		
		            		if(opcionjuego==1) {
		            			vida = Explorador.PhysicalAttack(Explorador.getStr()); 
		            			System.out.println("Has dado un golpe de " + Explorador.getStr() + " de daño físico");
		            			if (armaduraM > 0) {
		            				Monstruo.DamageVillianArmorPhy(Monstruo.getArmor(), Explorador.getStr());
			            			armaduraM = armaduraM - 10;
			            			System.out.println("Armadura en: " + armaduraM);
		            			} else {
		            				System.out.println("Monstruo sin armadura");
		            				if (healthM > 0) {
		            					Monstruo.DamageVillianLifePhy(Monstruo.getLife(), Explorador.getStr());
			            				healthM = healthM - 10;
			            				System.out.println("Vida del enemigo en: " + healthM);
			            			} else {
			            				System.out.println("Monstruo asesinado");
			            				villians = false;
			            			}
		            			}
		            		} 
		            		if(opcionjuego==2) {
		            			vida = Explorador.MagicalAttack(Explorador.getPower()); 
		            			System.out.println("Has dado un golpe de " + Explorador.getPower() + " de daño mágico");
		            			if (armaduraM > 0) {
		            				Monstruo.DamageVillianArmorMag(Monstruo.getArmor(), Explorador.getPower());
			            			armaduraM = armaduraM - 5;
			            			System.out.println("Armadura en: " + armaduraM);
		            			} else {
		            				System.out.println("Monstruo sin armadura");
		            				if (healthM > 0) {
		            					Monstruo.DamageVillianLifeMag(Monstruo.getLife(), Explorador.getPower());
			            				healthM = healthM - 5;
			            				System.out.println("Vida del enemigo en: " + healthM);
			            			} else {
			            				System.out.println("Monstruo asesinado");
			            				villians = false;
			            			}
		            			}
		            		} 
		            		if(opcionjuego==3) {
		            			vida = Explorador.ItemSalud(100, 10); 
		            			if (healthG < 100) {
			            			System.out.println("Te has recuperado 10 de vida");
			            			healthE = healthE + cureE;
		            			} else {
		            				System.out.println("No puedes curarte más");
		            			}
		            		}
		            		if(opcionjuego==4) {
		            			vida = Explorador.ItemArmadura(100, 10); 
		            			if (armaduraE < 100) {
			            			System.out.println("Te has recuperado 10 de armadura");
			            			armaduraE = armaduraE + cureE;
		            			} else {
		            				System.out.println("No puedes curarte más");
		            			}
		            		} 
		            	}while(heros && villians);
	            	}
	            	if (player==4) {
            			System.out.println("Un monstruo se avecina");
	            		do {            			
		            		System.out.println("Para poder combatir deberá elegir que hacer");
		            		System.out.println("1. Ataque físico");
		            		System.out.println("2. Ataque Mágico");
		            		System.out.println("3. Item de curación");
		            		System.out.println("4. Item de escudo");
		            		opcionjuego = entrada.nextInt();
		            		
		            		if(opcionjuego==1) {
		            			vida = Asesino.PhysicalAttack(Asesino.getStr()); 
		            			System.out.println("Has dado un golpe de " + Asesino.getStr() + " de daño físico");
		            			if (armaduraM > 0) {
		            				Monstruo.DamageVillianArmorPhy(Asesino.getArmor(), Asesino.getStr());
			            			armaduraM = armaduraM - 10;
			            			System.out.println("Armadura en: " + armaduraM);
		            			} else {
		            				System.out.println("Monstruo sin armadura");
		            				if (healthM > 0) {
		            					Monstruo.DamageVillianLifePhy(Monstruo.getLife(), Asesino.getStr());
			            				healthM = healthM - 10;
			            				System.out.println("Vida del enemigo en: " + healthM);
			            			} else {
			            				System.out.println("Monstruo asesinado");
			            				villians = false;
			            			}
		            			}
		            		} 
		            		if(opcionjuego==2) {
		            			vida = Asesino.MagicalAttack(Asesino.getPower()); 
		            			System.out.println("Has dado un golpe de " + Asesino.getPower() + " de daño mágico");
		            			if (armaduraM > 0) {
		            				Monstruo.DamageVillianArmorMag(Monstruo.getArmor(), Asesino.getPower());
			            			armaduraM = armaduraM - 5;
			            			System.out.println("Armadura en: " + armaduraM);
		            			} else {
		            				System.out.println("Monstruo sin armadura");
		            				if (healthM > 0) {
		            					Monstruo.DamageVillianLifeMag(Monstruo.getLife(), Asesino.getPower());
			            				healthM = healthM - 5;
			            				System.out.println("Vida del enemigo en: " + healthAs);
			            			} else {
			            				System.out.println("Monstruo asesinado");
			            				villians = false;
			            			}
		            			}
		            		} 
		            		if(opcionjuego==3) {
		            			vida = Asesino.ItemSalud(100, 10); 
		            			if (healthAs < 100) {
			            			System.out.println("Te has recuperado 10 de vida");
			            			healthAs = healthAs + cure;
		            			} else {
		            				System.out.println("No puedes curarte más");
		            			}
		            		}
		            		if(opcionjuego==4) {
		            			vida = Asesino.ItemArmadura(100, 10); 
		            			if (healthAs < 100) {
			            			System.out.println("Te has recuperado 10 de armadura");
			            			healthAs = healthAs + cure;
		            			} else {
		            				System.out.println("No puedes curarte más");
		            			}
		            		} 
		            	}while(heros && villians);
	            	}
	            	if (player==5) {
            			System.out.println("Un alien se avecina");
	            		do {            			
		            		System.out.println("Para poder combatir deberá elegir que hacer");
		            		System.out.println("1. Ataque físico");
		            		System.out.println("2. Ataque Mágico");
		            		System.out.println("3. Item de curación");
		            		System.out.println("4. Item de escudo");
		            		opcionjuego = entrada.nextInt();
		            		
		            		if(opcionjuego==1) {
		            			vida = Tanque.PhysicalAttack(Tanque.getStr()); 
		            			System.out.println("Has dado un golpe de " + Tanque.getStr() + " de daño físico");
		            			if (armaduraA > 0) {
		            				Alien.DamageVillianArmorPhy(Alien.getArmor(), Tanque.getStr());
			            			armaduraA = armaduraA - 10;
			            			System.out.println("Armadura en: " + armaduraA);
		            			} else {
		            				System.out.println("Monstruo sin armadura");
		            				if (healthA > 0) {
		            					Alien.DamageVillianLifePhy(Alien.getLife(), Tanque.getStr());
			            				healthA = healthA - 10;
			            				System.out.println("Vida del enemigo en: " + healthA);
			            			} else {
			            				System.out.println("Monstruo asesinado");
			            				villians = false;
			            			}
		            			}
		            		} 
		            		if(opcionjuego==2) {
		            			vida = Tanque.MagicalAttack(Tanque.getPower()); 
		            			System.out.println("Has dado un golpe de " + Tanque.getPower() + " de daño mágico");
		            			if (armaduraM > 0) {
		            				Alien.DamageVillianArmorMag(Alien.getArmor(), Tanque.getPower());
			            			armaduraA = armaduraA - 5;
			            			System.out.println("Armadura en: " + armaduraA);
		            			} else {
		            				System.out.println("Monstruo sin armadura");
		            				if (healthA > 0) {
		            					Alien.DamageVillianLifeMag(Alien.getLife(), Tanque.getPower());
			            				healthA = healthA - 5;
			            				System.out.println("Vida del enemigo en: " + healthA);
			            			} else {
			            				System.out.println("Monstruo asesinado");
			            				villians = false;
			            			}
		            			}
		            		} 
		            		if(opcionjuego==3) {
		            			vida = Tanque.ItemSalud(100, 10); 
		            			if (healthT < 100) {
			            			System.out.println("Te has recuperado 10 de vida");
			            			healthT = healthT + cure;
		            			} else {
		            				System.out.println("No puedes curarte más");
		            			}
		            		}
		            		if(opcionjuego==4) {
		            			vida = Tanque.ItemArmadura(100, 10); 
		            			if (healthG < 100) {
			            			System.out.println("Te has recuperado 10 de armadura");
			            			healthT = healthT + cure;
		            			} else {
		            				System.out.println("No puedes curarte más");
		            			}
		            		} 
		            	}while(heros && villians);
	            	}
	            	
	            	System.out.println("¿Quieres seguir?");
	            	opcion = 1;
	            	break;
	            case 2:
	            	System.out.println("Cerrando...");
	            	break;
	            case 3:
	            	System.out.println("Número mal ingresado pruebe nuevamente");
	            	break;
	            }		
	        }

	}
}	
